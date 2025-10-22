package com.example.repaso.veterinaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.repaso.veterinaria.dto.DetalleHistorialDTO;
import com.example.repaso.veterinaria.service.DetalleHistorialService;
import com.example.repaso.veterinaria.shared.SimpleCrudController;

@RestController
@RequestMapping("/api/v1/veterinaria/detalles-historial")
public class DetalleHistorialController extends SimpleCrudController<DetalleHistorialDTO> {
    public DetalleHistorialController(DetalleHistorialService service) {
        super(service);
    }
}
