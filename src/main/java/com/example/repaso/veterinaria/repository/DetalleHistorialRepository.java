package com.example.repaso.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.repaso.veterinaria.entity.DetalleHistorial;

public interface DetalleHistorialRepository extends JpaRepository<DetalleHistorial, Long> {
}
