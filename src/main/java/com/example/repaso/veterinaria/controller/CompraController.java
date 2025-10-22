package com.example.repaso.veterinaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.repaso.veterinaria.dto.CompraDTO;
import com.example.repaso.veterinaria.service.CompraService;
import com.example.repaso.veterinaria.shared.SimpleCrudController;

@RestController
@RequestMapping("/api/v1/veterinaria/compras")
public class CompraController extends SimpleCrudController<CompraDTO> {
    public CompraController(CompraService service) {
        super(service);
    }
}
