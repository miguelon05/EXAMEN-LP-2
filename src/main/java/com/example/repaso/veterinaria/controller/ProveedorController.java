package com.example.repaso.veterinaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.repaso.veterinaria.dto.ProveedorDTO;
import com.example.repaso.veterinaria.service.ProveedorService;
import com.example.repaso.veterinaria.shared.SimpleCrudController;

@RestController
@RequestMapping("/api/v1/veterinaria/proveedores")
public class ProveedorController extends SimpleCrudController<ProveedorDTO> {
    public ProveedorController(ProveedorService service) {
        super(service);
    }
}
