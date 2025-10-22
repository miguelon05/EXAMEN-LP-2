package com.example.repaso.veterinaria.service.impl;

import org.springframework.stereotype.Service;
import com.example.repaso.veterinaria.dto.ProductoDTO;
import com.example.repaso.veterinaria.entity.Producto;
import com.example.repaso.veterinaria.mapper.ProductoMapper;
import com.example.repaso.veterinaria.repository.ProductoRepository;
import com.example.repaso.veterinaria.service.ProductoService;
import com.example.repaso.veterinaria.shared.SimpleCrudService;

@Service
public class ProductoServiceImpl extends SimpleCrudService<Producto, ProductoDTO> implements ProductoService {
    public ProductoServiceImpl(ProductoRepository repository, ProductoMapper mapper) {
        super(repository, mapper);
    }
}
