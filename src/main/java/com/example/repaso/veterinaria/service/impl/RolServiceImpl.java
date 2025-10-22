package com.example.repaso.veterinaria.service.impl;

import org.springframework.stereotype.Service;
import com.example.repaso.veterinaria.dto.RolDTO;
import com.example.repaso.veterinaria.entity.Rol;
import com.example.repaso.veterinaria.mapper.RolMapper;
import com.example.repaso.veterinaria.repository.RolRepository;
import com.example.repaso.veterinaria.service.RolService;
import com.example.repaso.veterinaria.shared.SimpleCrudService;

@Service
public class RolServiceImpl extends SimpleCrudService<Rol, RolDTO> implements RolService {
    public RolServiceImpl(RolRepository repository, RolMapper mapper) {
        super(repository, mapper);
    }
}
