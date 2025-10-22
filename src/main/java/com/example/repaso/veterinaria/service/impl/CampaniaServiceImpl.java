package com.example.repaso.veterinaria.service.impl;

import org.springframework.stereotype.Service;
import com.example.repaso.veterinaria.dto.CampaniaDTO;
import com.example.repaso.veterinaria.entity.Campania;
import com.example.repaso.veterinaria.mapper.CampaniaMapper;
import com.example.repaso.veterinaria.repository.CampaniaRepository;
import com.example.repaso.veterinaria.service.CampaniaService;
import com.example.repaso.veterinaria.shared.SimpleCrudService;

@Service
public class CampaniaServiceImpl extends SimpleCrudService<Campania, CampaniaDTO> implements CampaniaService {
    public CampaniaServiceImpl(CampaniaRepository repository, CampaniaMapper mapper) {
        super(repository, mapper);
    }
}
