package com.example.repaso.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.repaso.veterinaria.entity.Inventario;

public interface InventarioRepository extends JpaRepository<Inventario, Long> {
}
