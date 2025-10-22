package com.example.repaso.veterinaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.repaso.veterinaria.dto.InventarioDTO;
import com.example.repaso.veterinaria.service.InventarioService;
import com.example.repaso.veterinaria.shared.SimpleCrudController;

@RestController
@RequestMapping("/api/v1/veterinaria/inventarios")
public class InventarioController extends SimpleCrudController<InventarioDTO> {
    public InventarioController(InventarioService service) {
        super(service);
    }
}
