package com.example.ferreterialasnaciones.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Usuario {
    private Integer id_usuario;
    private String nombre;
    private String contrasena;
}
