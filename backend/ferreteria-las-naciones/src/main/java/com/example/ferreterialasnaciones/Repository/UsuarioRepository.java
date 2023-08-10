package com.example.ferreterialasnaciones.Repository;

import com.example.ferreterialasnaciones.Models.Usuario;

import java.util.List;

public interface UsuarioRepository {
    void save(Usuario usuario);
    List<Usuario> getAll();
}