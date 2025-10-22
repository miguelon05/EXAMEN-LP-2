package com.example.repaso.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.repaso.veterinaria.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
