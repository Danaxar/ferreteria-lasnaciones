package com.example.ferreterialasnaciones.Entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    @JsonProperty("id_usuario")
    private Integer idUsuario;

    @JsonProperty("nombre_usuario")
    @Column(name = "nombre_usuario")
    private String nombreUsuario;

    @JsonProperty("contrasena_usuario")
    @Column(name = "contrasena_usuario")
    private String contrasenaUsuario;
}
