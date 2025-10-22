package com.example.repaso.veterinaria.service.impl;

import org.springframework.stereotype.Service;
import com.example.repaso.veterinaria.dto.VentaDTO;
import com.example.repaso.veterinaria.entity.Venta;
import com.example.repaso.veterinaria.mapper.VentaMapper;
import com.example.repaso.veterinaria.repository.VentaRepository;
import com.example.repaso.veterinaria.service.VentaService;
import com.example.repaso.veterinaria.shared.SimpleCrudService;

@Service
public class VentaServiceImpl extends SimpleCrudService<Venta, VentaDTO> implements VentaService {
    public VentaServiceImpl(VentaRepository repository, VentaMapper mapper) {
        super(repository, mapper);
    }
}
