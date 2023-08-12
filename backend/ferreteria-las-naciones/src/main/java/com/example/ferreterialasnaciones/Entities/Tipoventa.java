package com.example.ferreterialasnaciones.Entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Tipoventa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipoventa")
    private Integer idTipoventa;
    @Column(name = "nombre_tipoventa")
    private String nombreTipoventa;
}
