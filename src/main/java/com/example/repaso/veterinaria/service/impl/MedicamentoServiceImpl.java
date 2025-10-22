package com.example.repaso.veterinaria.service.impl;

import org.springframework.stereotype.Service;
import com.example.repaso.veterinaria.dto.MedicamentoDTO;
import com.example.repaso.veterinaria.entity.Medicamento;
import com.example.repaso.veterinaria.mapper.MedicamentoMapper;
import com.example.repaso.veterinaria.repository.MedicamentoRepository;
import com.example.repaso.veterinaria.service.MedicamentoService;
import com.example.repaso.veterinaria.shared.SimpleCrudService;

@Service
public class MedicamentoServiceImpl extends SimpleCrudService<Medicamento, MedicamentoDTO> implements MedicamentoService {
    public MedicamentoServiceImpl(MedicamentoRepository repository, MedicamentoMapper mapper) {
        super(repository, mapper);
    }
}
