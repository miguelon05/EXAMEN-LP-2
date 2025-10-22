package com.example.repaso.veterinaria.service.impl;

import org.springframework.stereotype.Service;
import com.example.repaso.veterinaria.dto.DetalleVentaDTO;
import com.example.repaso.veterinaria.entity.DetalleVenta;
import com.example.repaso.veterinaria.mapper.DetalleVentaMapper;
import com.example.repaso.veterinaria.repository.DetalleVentaRepository;
import com.example.repaso.veterinaria.service.DetalleVentaService;
import com.example.repaso.veterinaria.shared.SimpleCrudService;

@Service
public class DetalleVentaServiceImpl extends SimpleCrudService<DetalleVenta, DetalleVentaDTO> implements DetalleVentaService {
    public DetalleVentaServiceImpl(DetalleVentaRepository repository, DetalleVentaMapper mapper) {
        super(repository, mapper);
    }
}
