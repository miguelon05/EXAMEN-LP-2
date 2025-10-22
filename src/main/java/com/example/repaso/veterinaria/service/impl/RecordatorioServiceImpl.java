package com.example.repaso.veterinaria.service.impl;

import org.springframework.stereotype.Service;
import com.example.repaso.veterinaria.dto.RecordatorioDTO;
import com.example.repaso.veterinaria.entity.Recordatorio;
import com.example.repaso.veterinaria.mapper.RecordatorioMapper;
import com.example.repaso.veterinaria.repository.RecordatorioRepository;
import com.example.repaso.veterinaria.service.RecordatorioService;
import com.example.repaso.veterinaria.shared.SimpleCrudService;

@Service
public class RecordatorioServiceImpl extends SimpleCrudService<Recordatorio, RecordatorioDTO> implements RecordatorioService {
    public RecordatorioServiceImpl(RecordatorioRepository repository, RecordatorioMapper mapper) {
        super(repository, mapper);
    }
}
