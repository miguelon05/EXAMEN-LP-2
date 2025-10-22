package com.example.repaso.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.repaso.veterinaria.entity.CategoriaProducto;

public interface CategoriaProductoRepository extends JpaRepository<CategoriaProducto, Long> {
}
