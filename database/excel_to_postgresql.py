import csv
import psycopg2


def getIndex(lista, valor):
    for proveedor in lista:
        if proveedor[1] == valor:
            return proveedor[0]
    return 'NULL'


# Parámetros de conexión a la base de datos
db_params = {
    "host": "localhost",
    "database": "ferreteria",
    "user": "postgres",
    "password": "1212"
}

# Ruta al archivo CSV
csv_file_path = "./inventario_4_agosto.csv"

# Nombre de la tabla en PostgreSQL
table_name = "inventario"

# Conexión a la base de datos
connection = None
try:
    connection = psycopg2.connect(**db_params)
    cursor = connection.cursor()
    cursor.execute("SELECT * FROM proveedor")
    proveedores = cursor.fetchall()
    print("Proveedores: ", proveedores)

    # Leer y registrar el contenido del CSV en la tabla
    count = 0
    with open(csv_file_path, "r") as csv_file:
        csv_reader = csv.reader(csv_file, delimiter=";")
        next(csv_reader)  # Saltar la primera fila si contiene encabezados

        for row in csv_reader:
            insert_query = f"""
                INSERT INTO {table_name} (codigo_producto, producto, pventa, pmayoreo, id_departamento, existencia, tipoventa, id_proveedor)
                VALUES ('{row[0]}', '{row[1]}', {row[2]}, {row[3]}, {'NULL' if row[4] == "- Sin Departamento -" else row[4]}, {row[5]}, {1 if row[6] == "UNIDAD" else 2}, {getIndex(proveedores, row[7])});
            """
            cursor.execute(insert_query)
            connection.commit()
            print(row)
            count += 1

    print("Registros insertados correctamente.")
    print(f"Count = {count}")

except (Exception, psycopg2.Error) as error:
    print("Error al conectar o insertar en la base de datos:", error)

finally:
    if connection:
        cursor.close()
        connection.close()
        print("Conexión cerrada.")
