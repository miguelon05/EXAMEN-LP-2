package com.example.repaso.veterinaria.service.impl;

import org.springframework.stereotype.Service;
import com.example.repaso.veterinaria.dto.RecetaDTO;
import com.example.repaso.veterinaria.entity.Receta;
import com.example.repaso.veterinaria.mapper.RecetaMapper;
import com.example.repaso.veterinaria.repository.RecetaRepository;
import com.example.repaso.veterinaria.service.RecetaService;
import com.example.repaso.veterinaria.shared.SimpleCrudService;

@Service
public class RecetaServiceImpl extends SimpleCrudService<Receta, RecetaDTO> implements RecetaService {
    public RecetaServiceImpl(RecetaRepository repository, RecetaMapper mapper) {
        super(repository, mapper);
    }
}
