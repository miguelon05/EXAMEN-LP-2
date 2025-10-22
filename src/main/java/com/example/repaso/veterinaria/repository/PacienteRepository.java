package com.example.repaso.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.repaso.veterinaria.entity.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
