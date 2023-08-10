package com.example.ferreterialasnaciones.Repository;

import com.example.ferreterialasnaciones.Models.Departamento;

import java.util.List;

public interface DepartamentoRepository {
    void save(Departamento departamento);
    Departamento getById(Integer id);
    List<Departamento> getAll();
    void update(Departamento departamento);
    void delete(Integer id);
}
