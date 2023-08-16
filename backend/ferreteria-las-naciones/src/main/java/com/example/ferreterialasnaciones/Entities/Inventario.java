package com.example.ferreterialasnaciones.Entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "id_inventario")
    private Integer idInventario;

    @Column(name = "codigo_producto")
    private String codigoProducto;

    @Column(name = "producto")
    private String producto;

    @Column(name = "pventa")
    private Integer pventa;

    @Column(name = "pmayoreo")
    private Integer pmayoreo;

    @Column(name = "id_departamento")
    private Integer idDepartamento;

    @Column(name = "existencia")
    private Float existencia;

    @Column(name = "tipoventa")
    private Integer tipoventa;

    @Column(name = "id_proveedor")
    private Integer idProveedor;
}
