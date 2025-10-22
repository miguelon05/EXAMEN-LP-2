package com.example.repaso.veterinaria.service.impl;

import org.springframework.stereotype.Service;
import com.example.repaso.veterinaria.dto.ProveedorDTO;
import com.example.repaso.veterinaria.entity.Proveedor;
import com.example.repaso.veterinaria.mapper.ProveedorMapper;
import com.example.repaso.veterinaria.repository.ProveedorRepository;
import com.example.repaso.veterinaria.service.ProveedorService;
import com.example.repaso.veterinaria.shared.SimpleCrudService;

@Service
public class ProveedorServiceImpl extends SimpleCrudService<Proveedor, ProveedorDTO> implements ProveedorService {
    public ProveedorServiceImpl(ProveedorRepository repository, ProveedorMapper mapper) {
        super(repository, mapper);
    }
}
