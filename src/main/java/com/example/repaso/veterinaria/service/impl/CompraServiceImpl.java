package com.example.repaso.veterinaria.service.impl;

import org.springframework.stereotype.Service;
import com.example.repaso.veterinaria.dto.CompraDTO;
import com.example.repaso.veterinaria.entity.Compra;
import com.example.repaso.veterinaria.mapper.CompraMapper;
import com.example.repaso.veterinaria.repository.CompraRepository;
import com.example.repaso.veterinaria.service.CompraService;
import com.example.repaso.veterinaria.shared.SimpleCrudService;

@Service
public class CompraServiceImpl extends SimpleCrudService<Compra, CompraDTO> implements CompraService {
    public CompraServiceImpl(CompraRepository repository, CompraMapper mapper) {
        super(repository, mapper);
    }
}
