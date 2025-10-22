package com.example.repaso.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.repaso.veterinaria.entity.Personal;

public interface PersonalRepository extends JpaRepository<Personal, Long> {
}
