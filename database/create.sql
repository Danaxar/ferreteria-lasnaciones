drop table if exists departamento;

create table departamento(
    id_departamento SERIAL PRIMARY KEY,
    nombre_departamento varchar(25)
);

drop table if exists tipoventa;

create table tipoventa(
    id_tipoventa SERIAL PRIMARY KEY,
    nombre_tipoventa varchar(25)
);

drop table if exists proveedor;

create table proveedor(
    id_proveedor SERIAL PRIMARY KEY,
    nombre_proveedor varchar(50)
);

drop table if exists inventario;

create table inventario(
    codigo SERIAL PRIMARY KEY,
    codigo_producto varchar(20),
    producto varchar(100),
    pventa int,
    pmayoreo int,
    id_departamento int REFERENCES departamento(id_departamento),
    existencia float,
    tipoventa int REFERENCES tipoventa(id_tipoventa),
    id_proveedor int REFERENCES proveedor(id_proveedor)
);