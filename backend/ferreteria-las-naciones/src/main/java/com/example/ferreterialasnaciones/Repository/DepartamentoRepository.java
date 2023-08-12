package com.example.ferreterialasnaciones.Repository;

import com.example.ferreterialasnaciones.Entities.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Integer> {
}
