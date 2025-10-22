package com.example.repaso.veterinaria.service.impl;

import org.springframework.stereotype.Service;
import com.example.repaso.veterinaria.dto.InventarioDTO;
import com.example.repaso.veterinaria.entity.Inventario;
import com.example.repaso.veterinaria.mapper.InventarioMapper;
import com.example.repaso.veterinaria.repository.InventarioRepository;
import com.example.repaso.veterinaria.service.InventarioService;
import com.example.repaso.veterinaria.shared.SimpleCrudService;

@Service
public class InventarioServiceImpl extends SimpleCrudService<Inventario, InventarioDTO> implements InventarioService {
    public InventarioServiceImpl(InventarioRepository repository, InventarioMapper mapper) {
        super(repository, mapper);
    }
}
