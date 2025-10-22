package com.example.repaso.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.repaso.veterinaria.entity.Venta;

public interface VentaRepository extends JpaRepository<Venta, Long> {
}
