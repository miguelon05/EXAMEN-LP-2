package com.example.repaso.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.repaso.veterinaria.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
