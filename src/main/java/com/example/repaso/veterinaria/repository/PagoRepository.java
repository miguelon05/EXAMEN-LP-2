package com.example.repaso.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.repaso.veterinaria.entity.Pago;

public interface PagoRepository extends JpaRepository<Pago, Long> {
}
