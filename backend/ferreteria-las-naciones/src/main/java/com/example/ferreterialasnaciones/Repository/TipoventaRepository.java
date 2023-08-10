package com.example.ferreterialasnaciones.Repository;

import com.example.ferreterialasnaciones.Models.Tipoventa;

import java.util.List;

public interface TipoventaRepository {
    void save(Tipoventa tipoVenta);
    Tipoventa getById(Integer id);
    List<Tipoventa> getAll();
    void update(Tipoventa tipoVenta);
    void delete(Integer id);
}
