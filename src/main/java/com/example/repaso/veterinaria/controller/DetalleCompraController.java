package com.example.repaso.veterinaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.repaso.veterinaria.dto.DetalleCompraDTO;
import com.example.repaso.veterinaria.service.DetalleCompraService;
import com.example.repaso.veterinaria.shared.SimpleCrudController;

@RestController
@RequestMapping("/api/v1/veterinaria/detalle-compras")
public class DetalleCompraController extends SimpleCrudController<DetalleCompraDTO> {
    public DetalleCompraController(DetalleCompraService service) {
        super(service);
    }
}
