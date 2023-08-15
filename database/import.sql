-- Departamento
insert into
    departamento(nombre_departamento)
values
    ('Construcción y ferretería'),
    ('Fijaciones y tornillería'),
    ('Jardinería'),
    ('Luz y electricidad'),
    ('Pinturas'),
    ('Seguridad y hogar');

-- Tipo de venta
insert into
    tipoventa(nombre_tipoventa)
values
    ('UNIDAD'),
    ('GRANEL');

-- Proveedor
INSERT INTO
    proveedor (nombre_proveedor)
VALUES
    ('Action'),
    ('adepac'),
    ('ALPROIN'),
    ('Amanecer'),
    ('ante'),
    ('AquaKit'),
    ('bash'),
    ('BAUMAK SPA'),
    ('carbones socoin'),
    ('castillo'),
    ('cima'),
    ('cintac'),
    ('Comercial bull y co(escorpio)'),
    ('Comercial J&L SPA'),
    ('comercial motorshop limitada'),
    ('Comercializadora Feragro SPA'),
    ('comisa'),
    ('Conmetal'),
    ('contreras'),
    ('dideval'),
    ('distribuidora regalogar limitada'),
    ('dvp'),
    ('el rincon del mueblista'),
    ('eln ltda'),
    ('elproin'),
    ('escorpion'),
    ('f3c'),
    ('FERBICOM'),
    ('ferre center'),
    ('ferrecentro'),
    ('ferremundo'),
    ('ferreweb'),
    ('ferromat'),
    ('full protek'),
    ('full sello'),
    ('fulsello'),
    ('galan spa valencia'),
    ('gasfit'),
    ('GILI'),
    ('globalled'),
    ('GOBANTES'),
    ('GVM'),
    ('HELA'),
    ('herrera'),
    ('hidraulicos'),
    ('hoffens'),
    ('imperial'),
    ('importadora y distribuidora tress s.a'),
    ('ISESA'),
    ('ISOPLAST'),
    ('jaime brieva'),
    ('JC galvanizados'),
    ('LANCO'),
    ('lioi'),
    ('madera wiacot limitada'),
    ('mag chile'),
    ('mamut'),
    ('metalsa'),
    ('Oscar(castillo)'),
    ('reperf limitada'),
    ('rgm'),
    ('ricardo gomas'),
    ('santa ines'),
    ('sigma'),
    ('Sima(pegatanque)'),
    ('sixcam'),
    ('surti venta'),
    ('t h c'),
    ('tajamar'),
    ('taumm'),
    ('todoferretero'),
    ('TRANSEX'),
    ('Trentini'),
    ('tricolor'),
    ('uyustool'),
    ('valprik'),
    ('vitel'),
    ('weber');

-- Tipo de usuario
insert into
    acceso(nombre_acceso)
values
    ('Ventas'),
    ('Productos'),
    ('Inventario'),
    ('Reportes'),
    ('Ajustes');

-- Usuarios
insert into
    usuario(nombre_usuario, contrasena_usuario)
values
('kevin', 'zeus1307'),
('reinaldo', '123'),
    ('bernardo', '123'),
    ('marina', 123);