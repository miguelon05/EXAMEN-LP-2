package com.example.repaso.veterinaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.repaso.veterinaria.dto.RolDTO;
import com.example.repaso.veterinaria.service.RolService;
import com.example.repaso.veterinaria.shared.SimpleCrudController;

@RestController
@RequestMapping("/api/v1/veterinaria/roles")
public class RolController extends SimpleCrudController<RolDTO> {
    public RolController(RolService service) {
        super(service);
    }
}
