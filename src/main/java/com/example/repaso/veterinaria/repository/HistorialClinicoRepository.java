package com.example.repaso.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.repaso.veterinaria.entity.HistorialClinico;

public interface HistorialClinicoRepository extends JpaRepository<HistorialClinico, Long> {
}
