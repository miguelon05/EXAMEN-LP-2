package com.example.repaso.veterinaria.service.impl;

import org.springframework.stereotype.Service;
import com.example.repaso.veterinaria.dto.HistorialClinicoDTO;
import com.example.repaso.veterinaria.entity.HistorialClinico;
import com.example.repaso.veterinaria.mapper.HistorialClinicoMapper;
import com.example.repaso.veterinaria.repository.HistorialClinicoRepository;
import com.example.repaso.veterinaria.service.HistorialClinicoService;
import com.example.repaso.veterinaria.shared.SimpleCrudService;

@Service
public class HistorialClinicoServiceImpl extends SimpleCrudService<HistorialClinico, HistorialClinicoDTO> implements HistorialClinicoService {
    public HistorialClinicoServiceImpl(HistorialClinicoRepository repository, HistorialClinicoMapper mapper) {
        super(repository, mapper);
    }
}
