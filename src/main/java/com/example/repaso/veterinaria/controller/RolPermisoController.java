package com.example.repaso.veterinaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.repaso.veterinaria.dto.RolPermisoDTO;
import com.example.repaso.veterinaria.service.RolPermisoService;
import com.example.repaso.veterinaria.shared.SimpleCrudController;

@RestController
@RequestMapping("/api/v1/veterinaria/roles-permisos")
public class RolPermisoController extends SimpleCrudController<RolPermisoDTO> {
    public RolPermisoController(RolPermisoService service) {
        super(service);
    }
}
