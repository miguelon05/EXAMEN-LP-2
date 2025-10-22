package com.example.repaso.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.repaso.veterinaria.entity.Rol;

public interface RolRepository extends JpaRepository<Rol, Long> {
}
