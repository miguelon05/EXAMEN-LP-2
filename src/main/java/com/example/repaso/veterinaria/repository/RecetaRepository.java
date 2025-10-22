package com.example.repaso.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.repaso.veterinaria.entity.Receta;

public interface RecetaRepository extends JpaRepository<Receta, Long> {
}
