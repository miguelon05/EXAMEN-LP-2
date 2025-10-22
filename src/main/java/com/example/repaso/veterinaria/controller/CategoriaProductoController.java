package com.example.repaso.veterinaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.repaso.veterinaria.dto.CategoriaProductoDTO;
import com.example.repaso.veterinaria.service.CategoriaProductoService;
import com.example.repaso.veterinaria.shared.SimpleCrudController;

@RestController
@RequestMapping("/api/v1/veterinaria/categorias-producto")
public class CategoriaProductoController extends SimpleCrudController<CategoriaProductoDTO> {
    public CategoriaProductoController(CategoriaProductoService service) {
        super(service);
    }
}
