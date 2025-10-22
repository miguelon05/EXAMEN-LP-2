package com.example.repaso.veterinaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.repaso.veterinaria.dto.FacturaDTO;
import com.example.repaso.veterinaria.service.FacturaService;
import com.example.repaso.veterinaria.shared.SimpleCrudController;

@RestController
@RequestMapping("/api/v1/veterinaria/facturas")
public class FacturaController extends SimpleCrudController<FacturaDTO> {
    public FacturaController(FacturaService service) {
        super(service);
    }
}
