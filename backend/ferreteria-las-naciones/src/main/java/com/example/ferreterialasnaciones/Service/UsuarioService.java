package com.example.ferreterialasnaciones.Service;

import com.example.ferreterialasnaciones.Models.Usuario;
import com.example.ferreterialasnaciones.Repository.UsuarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    @PostMapping
    public void save(@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);
    }

    @GetMapping
    public List<Usuario> getAll(){
        return usuarioRepository.getAll();
    }
}
