package com.example.repaso.veterinaria.service.impl;

import org.springframework.stereotype.Service;
import com.example.repaso.veterinaria.dto.DetalleHistorialDTO;
import com.example.repaso.veterinaria.entity.DetalleHistorial;
import com.example.repaso.veterinaria.mapper.DetalleHistorialMapper;
import com.example.repaso.veterinaria.repository.DetalleHistorialRepository;
import com.example.repaso.veterinaria.service.DetalleHistorialService;
import com.example.repaso.veterinaria.shared.SimpleCrudService;

@Service
public class DetalleHistorialServiceImpl extends SimpleCrudService<DetalleHistorial, DetalleHistorialDTO> implements DetalleHistorialService {
    public DetalleHistorialServiceImpl(DetalleHistorialRepository repository, DetalleHistorialMapper mapper) {
        super(repository, mapper);
    }
}
