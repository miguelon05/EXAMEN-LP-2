package com.example.repaso.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.repaso.veterinaria.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
