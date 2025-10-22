package com.example.repaso.veterinaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.repaso.veterinaria.dto.DetalleVentaDTO;
import com.example.repaso.veterinaria.service.DetalleVentaService;
import com.example.repaso.veterinaria.shared.SimpleCrudController;

@RestController
@RequestMapping("/api/v1/veterinaria/detalle-ventas")
public class DetalleVentaController extends SimpleCrudController<DetalleVentaDTO> {
    public DetalleVentaController(DetalleVentaService service) {
        super(service);
    }
}
