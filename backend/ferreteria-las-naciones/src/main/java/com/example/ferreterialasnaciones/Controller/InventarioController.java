package com.example.ferreterialasnaciones.Controller;

import com.example.ferreterialasnaciones.Entities.Inventario;
import com.example.ferreterialasnaciones.Service.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/inventarios")
@CrossOrigin("*")
public class InventarioController {
    @Autowired
    InventarioService inventarioService;

    @GetMapping
    public List<Inventario> getAll(){
        return inventarioService.getAll();
    }
}
