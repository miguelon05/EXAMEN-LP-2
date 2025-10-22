package com.example.repaso.veterinaria.service.impl;

import org.springframework.stereotype.Service;
import com.example.repaso.veterinaria.dto.PacienteDTO;
import com.example.repaso.veterinaria.entity.Paciente;
import com.example.repaso.veterinaria.mapper.PacienteMapper;
import com.example.repaso.veterinaria.repository.PacienteRepository;
import com.example.repaso.veterinaria.service.PacienteService;
import com.example.repaso.veterinaria.shared.SimpleCrudService;

@Service
public class PacienteServiceImpl extends SimpleCrudService<Paciente, PacienteDTO> implements PacienteService {
    public PacienteServiceImpl(PacienteRepository repository, PacienteMapper mapper) {
        super(repository, mapper);
    }
}
