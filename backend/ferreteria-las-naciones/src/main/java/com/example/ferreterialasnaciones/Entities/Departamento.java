package com.example.ferreterialasnaciones.Entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_departamento")
    private Integer idDepartamento;

    @Column(name = "nombre_departamento")
    private String nombreDepartamento;
}