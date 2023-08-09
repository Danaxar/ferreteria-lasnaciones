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
    codigo_producto varchar(20) unique,
    producto varchar(100),
    pventa int,
    pmayoreo int,
    id_departamento int REFERENCES departamento(id_departamento),
    existencia float,
    tipoventa int REFERENCES tipoventa(id_tipoventa),
    id_proveedor int REFERENCES proveedor(id_proveedor)
);

drop table if exists acceso;

create table acceso(
    id_acceso SERIAL PRIMARY KEY,
    nombre_acceso varchar(25)
);

drop table if exists usuario;

create table usuario(
    id_usuario SERIAL PRIMARY KEY,
    nombre varchar(50),
    contrasena varchar(50)
);

drop table if exists usuario_acceso;

create table usuario_acceso(
    id_usuario int REFERENCES usuario(id_usuario),
    id_acceso int REFERENCES acceso(id_acceso),
    PRIMARY KEY(id_usuario, id_acceso)
);

drop table if exists venta;

create table venta(
    id_venta SERIAL PRIMARY KEY,
    id_inventario int REFERENCES inventario(codigo),
    cantidad float,
    total int,
    fecha date,
    hora time,
    cajero int REFERENCES usuario(id_usuario)
);

drop table if exists ventacomun;

create table ventacomun(
    id_ventacomun SERIAL PRIMARY KEY,
    descripcion varchar(100),
    cantidad int,
    precio int
);