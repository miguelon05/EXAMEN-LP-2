package com.example.repaso.veterinaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.repaso.veterinaria.dto.VentaDTO;
import com.example.repaso.veterinaria.service.VentaService;
import com.example.repaso.veterinaria.shared.SimpleCrudController;

@RestController
@RequestMapping("/api/v1/veterinaria/ventas")
public class VentaController extends SimpleCrudController<VentaDTO> {
    public VentaController(VentaService service) {
        super(service);
    }
}
