package com.example.ferreterialasnaciones.Repository;

import com.example.ferreterialasnaciones.Models.Tipoventa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class TipoventaRepositoryImp implements TipoventaRepository{
    @Autowired
    private Sql2o sql2o;

    @Override
    public void save(Tipoventa tipoVenta) {
        String query = "INSERT INTO tipoventa (nombre_tipoventa) " +
                "VALUES (:nombreTipoventa)";
        try (Connection connection = sql2o.open()) {
            connection.createQuery(query)
                    .addParameter("nombreTipoventa", tipoVenta.getNombre_tipoVenta())
                    .executeUpdate();
        }
    }

    @Override
    public Tipoventa getById(Integer id) {
        String query = "SELECT * FROM tipoventa WHERE id_tipoventa = :id";
        try (Connection connection = sql2o.open()) {
            return connection.createQuery(query)
                    .addParameter("id", id)
                    .executeAndFetchFirst(Tipoventa.class);
        }
    }

    @Override
    public List<Tipoventa> getAll() {
        String query = "SELECT * FROM tipoventa";
        try (Connection connection = sql2o.open()) {
            return connection.createQuery(query)
                    .executeAndFetch(Tipoventa.class);
        }
    }

    @Override
    public void update(Tipoventa tipoVenta) {
        String query = "UPDATE tipoventa SET nombre_tipoventa = :nombreTipoventa " +
                "WHERE id_tipoventa = :idTipoventa";
        try (Connection connection = sql2o.open()) {
            connection.createQuery(query)
                    .addParameter("nombreTipoventa", tipoVenta.getNombre_tipoVenta())
                    .addParameter("idTipoventa", tipoVenta.getId_tipoVenta())
                    .executeUpdate();
        }
    }

    @Override
    public void delete(Integer id) {
        String query = "DELETE FROM tipoventa WHERE id_tipoventa = :id";
        try (Connection connection = sql2o.open()) {
            connection.createQuery(query)
                    .addParameter("id", id)
                    .executeUpdate();
        }
    }
}
