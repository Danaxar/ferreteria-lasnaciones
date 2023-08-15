package com.example.ferreterialasnaciones.Controller;

import com.example.ferreterialasnaciones.Entities.Usuario;
import com.example.ferreterialasnaciones.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin("*")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> getAll() {
        System.out.println("Entregando la lista de usuarios...");
        return usuarioService.getAll();
    }

    @PostMapping("/login")
    public boolean login(@RequestBody Usuario usuario) {
        return usuarioService.login(usuario.getNombreUsuario(), usuario.getContrasenaUsuario());
    }


}
