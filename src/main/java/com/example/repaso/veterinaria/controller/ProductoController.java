package com.example.repaso.veterinaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.repaso.veterinaria.dto.ProductoDTO;
import com.example.repaso.veterinaria.service.ProductoService;
import com.example.repaso.veterinaria.shared.SimpleCrudController;

@RestController
@RequestMapping("/api/v1/veterinaria/productos")
public class ProductoController extends SimpleCrudController<ProductoDTO> {
    public ProductoController(ProductoService service) {
        super(service);
    }
}
