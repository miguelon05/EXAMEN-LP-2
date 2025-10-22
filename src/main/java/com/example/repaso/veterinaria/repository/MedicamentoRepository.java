package com.example.repaso.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.repaso.veterinaria.entity.Medicamento;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {
}
