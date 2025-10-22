package com.example.repaso.veterinaria.service.impl;

import org.springframework.stereotype.Service;
import com.example.repaso.veterinaria.dto.PermisoDTO;
import com.example.repaso.veterinaria.entity.Permiso;
import com.example.repaso.veterinaria.mapper.PermisoMapper;
import com.example.repaso.veterinaria.repository.PermisoRepository;
import com.example.repaso.veterinaria.service.PermisoService;
import com.example.repaso.veterinaria.shared.SimpleCrudService;

@Service
public class PermisoServiceImpl extends SimpleCrudService<Permiso, PermisoDTO> implements PermisoService {
    public PermisoServiceImpl(PermisoRepository repository, PermisoMapper mapper) {
        super(repository, mapper);
    }
}
