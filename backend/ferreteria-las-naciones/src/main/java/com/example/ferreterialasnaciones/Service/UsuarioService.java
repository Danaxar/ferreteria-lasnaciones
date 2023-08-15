package com.example.ferreterialasnaciones.Service;

import com.example.ferreterialasnaciones.Entities.Usuario;
import com.example.ferreterialasnaciones.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public boolean login(String nombreUsuario, String contrasenaUsuario) {
        return usuarioRepository.existsByNombreUsuarioAndContrasenaUsuario(nombreUsuario, contrasenaUsuario);
    }

    public List<Usuario> getAll() {
        return usuarioRepository.findAll();
    }


}
