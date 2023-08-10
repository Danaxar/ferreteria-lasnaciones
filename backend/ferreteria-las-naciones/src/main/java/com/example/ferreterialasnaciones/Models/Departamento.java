package com.example.ferreterialasnaciones.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Departamento {
    @JsonProperty("id_departamento")
    private Integer id_departamento;

    @JsonProperty("nombre_departamento")
    private String nombre_departamento;
}