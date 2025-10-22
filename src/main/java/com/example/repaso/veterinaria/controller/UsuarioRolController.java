package com.example.repaso.veterinaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.repaso.veterinaria.dto.UsuarioRolDTO;
import com.example.repaso.veterinaria.service.UsuarioRolService;
import com.example.repaso.veterinaria.shared.SimpleCrudController;

@RestController
@RequestMapping("/api/v1/veterinaria/usuario-roles")
public class UsuarioRolController extends SimpleCrudController<UsuarioRolDTO> {
    public UsuarioRolController(UsuarioRolService service) {
        super(service);
    }
}
