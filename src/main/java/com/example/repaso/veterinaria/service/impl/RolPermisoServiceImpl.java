package com.example.repaso.veterinaria.service.impl;

import org.springframework.stereotype.Service;
import com.example.repaso.veterinaria.dto.RolPermisoDTO;
import com.example.repaso.veterinaria.entity.RolPermiso;
import com.example.repaso.veterinaria.mapper.RolPermisoMapper;
import com.example.repaso.veterinaria.repository.RolPermisoRepository;
import com.example.repaso.veterinaria.service.RolPermisoService;
import com.example.repaso.veterinaria.shared.SimpleCrudService;

@Service
public class RolPermisoServiceImpl extends SimpleCrudService<RolPermiso, RolPermisoDTO> implements RolPermisoService {
    public RolPermisoServiceImpl(RolPermisoRepository repository, RolPermisoMapper mapper) {
        super(repository, mapper);
    }
}
