package com.example.ferreterialasnaciones.Repository;

import com.example.ferreterialasnaciones.Models.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class DepartamentoRepositoryImp implements DepartamentoRepository {
    @Autowired
    private Sql2o sql2o;

    @Override
    public void save(Departamento departamento) {
        String query = "INSERT INTO departamento (nombre_departamento) " +
                "VALUES (:nombreDepartamento)";
        try (Connection connection = sql2o.open()) {
            connection.createQuery(query)
                    .addParameter("nombreDepartamento", departamento.getNombre_departamento())
                    .executeUpdate();
        }
    }

    @Override
    public Departamento getById(Integer id) {
        String query = "SELECT * FROM departamento WHERE id_departamento = :id";
        try (Connection connection = sql2o.open()) {
            return connection.createQuery(query)
                    .addParameter("id", id)
                    .executeAndFetchFirst(Departamento.class);
        }
    }

    @Override
    public List<Departamento> getAll() {
        String query = "SELECT * FROM departamento";
        try (Connection connection = sql2o.open()) {
            return connection.createQuery(query)
                    .executeAndFetch(Departamento.class);
        }
    }

    @Override
    public void update(Departamento departamento) {
        String query = "UPDATE departamento SET nombre_departamento = :nombreDepartamento " +
                "WHERE id_departamento = :idDepartamento";
        try (Connection connection = sql2o.open()) {
            connection.createQuery(query)
                    .addParameter("nombreDepartamento", departamento.getNombre_departamento())
                    .addParameter("idDepartamento", departamento.getId_departamento())
                    .executeUpdate();
        }
    }

    @Override
    public void delete(Integer id) {
        String query = "DELETE FROM departamento WHERE id_departamento = :id";
        try (Connection connection = sql2o.open()) {
            connection.createQuery(query)
                    .addParameter("id", id)
                    .executeUpdate();
        }
    }
}

