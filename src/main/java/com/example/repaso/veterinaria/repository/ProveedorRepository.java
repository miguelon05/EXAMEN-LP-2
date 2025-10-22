package com.example.repaso.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.repaso.veterinaria.entity.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {
}
