package com.example.repaso.veterinaria.service.impl;

import org.springframework.stereotype.Service;
import com.example.repaso.veterinaria.dto.VacunaDTO;
import com.example.repaso.veterinaria.entity.Vacuna;
import com.example.repaso.veterinaria.mapper.VacunaMapper;
import com.example.repaso.veterinaria.repository.VacunaRepository;
import com.example.repaso.veterinaria.service.VacunaService;
import com.example.repaso.veterinaria.shared.SimpleCrudService;

@Service
public class VacunaServiceImpl extends SimpleCrudService<Vacuna, VacunaDTO> implements VacunaService {
    public VacunaServiceImpl(VacunaRepository repository, VacunaMapper mapper) {
        super(repository, mapper);
    }
}
