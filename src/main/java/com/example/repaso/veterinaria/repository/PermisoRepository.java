package com.example.repaso.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.repaso.veterinaria.entity.Permiso;

public interface PermisoRepository extends JpaRepository<Permiso, Long> {
}
