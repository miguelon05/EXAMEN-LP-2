package com.example.repaso.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.repaso.veterinaria.entity.Factura;

public interface FacturaRepository extends JpaRepository<Factura, Long> {
}
