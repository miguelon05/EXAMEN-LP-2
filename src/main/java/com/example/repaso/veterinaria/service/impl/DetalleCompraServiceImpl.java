package com.example.repaso.veterinaria.service.impl;

import org.springframework.stereotype.Service;
import com.example.repaso.veterinaria.dto.DetalleCompraDTO;
import com.example.repaso.veterinaria.entity.DetalleCompra;
import com.example.repaso.veterinaria.mapper.DetalleCompraMapper;
import com.example.repaso.veterinaria.repository.DetalleCompraRepository;
import com.example.repaso.veterinaria.service.DetalleCompraService;
import com.example.repaso.veterinaria.shared.SimpleCrudService;

@Service
public class DetalleCompraServiceImpl extends SimpleCrudService<DetalleCompra, DetalleCompraDTO> implements DetalleCompraService {
    public DetalleCompraServiceImpl(DetalleCompraRepository repository, DetalleCompraMapper mapper) {
        super(repository, mapper);
    }
}
