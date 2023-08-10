package com.example.ferreterialasnaciones.Repository;

import com.example.ferreterialasnaciones.Models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class UsuarioRepositoryImp implements UsuarioRepository{
    @Autowired
    private Sql2o sql2o;
    @Override
    public void save(Usuario usuario){
        String query = "INSERT INTO usuario (nombre, contrasena) " +
                "VALUES (:nombre, :contrasena)";
        try (Connection connection = sql2o.open()) {
            connection.createQuery(query)
                    .addParameter("nombre", usuario.getNombre())
                    .addParameter("contrasena", usuario.getContrasena())
                    .executeUpdate();

        }
    }

    @Override
    public List<Usuario> getAll(){
        String query = "SELECT * FROM usuario";
        try (Connection connection = sql2o.open()) {
            return connection.createQuery(query).executeAndFetch(Usuario.class);
        }
    }
}
