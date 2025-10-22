package com.example.repaso.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.repaso.veterinaria.entity.Compra;

public interface CompraRepository extends JpaRepository<Compra, Long> {
}
