package com.example.ferreterialasnaciones.Entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer idInventario;
    private String codigoProducto;
    private String producto;
    private Integer pventa;
    private Integer pmayoreo;
    private Integer idDepartamento;
    private Float existencia;
    private Integer tipoventa;
    private Integer idProveedor;
}
