package com.example.repaso.veterinaria.service.impl;

import org.springframework.stereotype.Service;
import com.example.repaso.veterinaria.dto.PagoDTO;
import com.example.repaso.veterinaria.entity.Pago;
import com.example.repaso.veterinaria.mapper.PagoMapper;
import com.example.repaso.veterinaria.repository.PagoRepository;
import com.example.repaso.veterinaria.service.PagoService;
import com.example.repaso.veterinaria.shared.SimpleCrudService;

@Service
public class PagoServiceImpl extends SimpleCrudService<Pago, PagoDTO> implements PagoService {
    public PagoServiceImpl(PagoRepository repository, PagoMapper mapper) {
        super(repository, mapper);
    }
}
