package com.example.repaso.veterinaria.service.impl;

import org.springframework.stereotype.Service;
import com.example.repaso.veterinaria.dto.UsuarioRolDTO;
import com.example.repaso.veterinaria.entity.UsuarioRol;
import com.example.repaso.veterinaria.mapper.UsuarioRolMapper;
import com.example.repaso.veterinaria.repository.UsuarioRolRepository;
import com.example.repaso.veterinaria.service.UsuarioRolService;
import com.example.repaso.veterinaria.shared.SimpleCrudService;

@Service
public class UsuarioRolServiceImpl extends SimpleCrudService<UsuarioRol, UsuarioRolDTO> implements UsuarioRolService {
    public UsuarioRolServiceImpl(UsuarioRolRepository repository, UsuarioRolMapper mapper) {
        super(repository, mapper);
    }
}
