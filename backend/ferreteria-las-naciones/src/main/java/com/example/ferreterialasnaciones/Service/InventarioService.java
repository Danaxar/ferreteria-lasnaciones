package com.example.ferreterialasnaciones.Service;

import com.example.ferreterialasnaciones.Entities.Inventario;
import com.example.ferreterialasnaciones.Repository.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventarioService {
    @Autowired
    InventarioRepository inventarioRepository;

    public List<Inventario> getAll(){
        return inventarioRepository.findAll();
    }
}
