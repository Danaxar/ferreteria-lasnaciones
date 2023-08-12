package com.example.ferreterialasnaciones.Repository;

import com.example.ferreterialasnaciones.Entities.Tipoventa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoventaRepository extends JpaRepository<Tipoventa, Integer> {
}
