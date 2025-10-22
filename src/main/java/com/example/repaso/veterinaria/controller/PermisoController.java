package com.example.repaso.veterinaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.repaso.veterinaria.dto.PermisoDTO;
import com.example.repaso.veterinaria.service.PermisoService;
import com.example.repaso.veterinaria.shared.SimpleCrudController;

@RestController
@RequestMapping("/api/v1/veterinaria/permisos")
public class PermisoController extends SimpleCrudController<PermisoDTO> {
    public PermisoController(PermisoService service) {
        super(service);
    }
}
