package com.example.repaso.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.repaso.veterinaria.entity.Recordatorio;

public interface RecordatorioRepository extends JpaRepository<Recordatorio, Long> {
}
