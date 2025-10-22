package com.example.repaso.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.repaso.veterinaria.entity.Servicio;

public interface ServicioRepository extends JpaRepository<Servicio, Long> {
}
