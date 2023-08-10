package com.example.ferreterialasnaciones.Service;

import com.example.ferreterialasnaciones.Models.Departamento;
import com.example.ferreterialasnaciones.Repository.DepartamentoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departamentos")
public class DepartamentoService {
    private final DepartamentoRepository departamentoRepository;

    public DepartamentoService(DepartamentoRepository departamentoRepository) {
        this.departamentoRepository = departamentoRepository;
    }

    @PostMapping
    public void save(@RequestBody Departamento departamento) {
        departamentoRepository.save(departamento);
    }

    @GetMapping("/{id}")
    public Departamento getById(@PathVariable Integer id) {
        return departamentoRepository.getById(id);
    }

    @GetMapping
    public List<Departamento> getAll() {
        return departamentoRepository.getAll();
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Integer id, @RequestBody Departamento departamento) {
        departamento.setId_departamento(id);
        departamentoRepository.update(departamento);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        departamentoRepository.delete(id);
    }
}
