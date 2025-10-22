package com.example.repaso.veterinaria.service.impl;

import org.springframework.stereotype.Service;
import com.example.repaso.veterinaria.dto.CitaDTO;
import com.example.repaso.veterinaria.entity.Cita;
import com.example.repaso.veterinaria.mapper.CitaMapper;
import com.example.repaso.veterinaria.repository.CitaRepository;
import com.example.repaso.veterinaria.service.CitaService;
import com.example.repaso.veterinaria.shared.SimpleCrudService;

@Service
public class CitaServiceImpl extends SimpleCrudService<Cita, CitaDTO> implements CitaService {
    public CitaServiceImpl(CitaRepository repository, CitaMapper mapper) {
        super(repository, mapper);
    }
}
