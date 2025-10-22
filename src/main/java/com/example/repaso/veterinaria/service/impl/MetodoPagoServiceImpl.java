package com.example.repaso.veterinaria.service.impl;

import org.springframework.stereotype.Service;
import com.example.repaso.veterinaria.dto.MetodoPagoDTO;
import com.example.repaso.veterinaria.entity.MetodoPago;
import com.example.repaso.veterinaria.mapper.MetodoPagoMapper;
import com.example.repaso.veterinaria.repository.MetodoPagoRepository;
import com.example.repaso.veterinaria.service.MetodoPagoService;
import com.example.repaso.veterinaria.shared.SimpleCrudService;

@Service
public class MetodoPagoServiceImpl extends SimpleCrudService<MetodoPago, MetodoPagoDTO> implements MetodoPagoService {
    public MetodoPagoServiceImpl(MetodoPagoRepository repository, MetodoPagoMapper mapper) {
        super(repository, mapper);
    }
}
