package com.example.repaso.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.repaso.veterinaria.entity.Vacuna;

public interface VacunaRepository extends JpaRepository<Vacuna, Long> {
}
