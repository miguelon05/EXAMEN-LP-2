package com.example.repaso.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.repaso.veterinaria.entity.MetodoPago;

public interface MetodoPagoRepository extends JpaRepository<MetodoPago, Long> {
}
