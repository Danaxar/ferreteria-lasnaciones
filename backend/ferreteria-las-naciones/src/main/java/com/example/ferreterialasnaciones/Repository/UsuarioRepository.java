package com.example.ferreterialasnaciones.Repository;

import com.example.ferreterialasnaciones.Entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    public boolean existsByNombreUsuarioAndContrasenaUsuario(String nombreUsuario, String contrasenaUsuario);
}