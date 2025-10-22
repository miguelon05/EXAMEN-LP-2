package com.example.repaso.veterinaria.service.impl;

import org.springframework.stereotype.Service;
import com.example.repaso.veterinaria.dto.FacturaDTO;
import com.example.repaso.veterinaria.entity.Factura;
import com.example.repaso.veterinaria.mapper.FacturaMapper;
import com.example.repaso.veterinaria.repository.FacturaRepository;
import com.example.repaso.veterinaria.service.FacturaService;
import com.example.repaso.veterinaria.shared.SimpleCrudService;

@Service
public class FacturaServiceImpl extends SimpleCrudService<Factura, FacturaDTO> implements FacturaService {
    public FacturaServiceImpl(FacturaRepository repository, FacturaMapper mapper) {
        super(repository, mapper);
    }
}
