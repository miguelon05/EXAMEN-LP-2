package com.example.repaso.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.repaso.veterinaria.entity.Tratamiento;

public interface TratamientoRepository extends JpaRepository<Tratamiento, Long> {
}
