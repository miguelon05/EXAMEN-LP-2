package com.example.repaso.veterinaria.service.impl;

import org.springframework.stereotype.Service;
import com.example.repaso.veterinaria.dto.CategoriaProductoDTO;
import com.example.repaso.veterinaria.entity.CategoriaProducto;
import com.example.repaso.veterinaria.mapper.CategoriaProductoMapper;
import com.example.repaso.veterinaria.repository.CategoriaProductoRepository;
import com.example.repaso.veterinaria.service.CategoriaProductoService;
import com.example.repaso.veterinaria.shared.SimpleCrudService;

@Service
public class CategoriaProductoServiceImpl extends SimpleCrudService<CategoriaProducto, CategoriaProductoDTO> implements CategoriaProductoService {
    public CategoriaProductoServiceImpl(CategoriaProductoRepository repository, CategoriaProductoMapper mapper) {
        super(repository, mapper);
    }
}
