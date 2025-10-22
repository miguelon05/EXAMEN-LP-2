package com.example.repaso.veterinaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.repaso.veterinaria.dto.UsuarioDTO;
import com.example.repaso.veterinaria.service.UsuarioService;
import com.example.repaso.veterinaria.shared.SimpleCrudController;

@RestController
@RequestMapping("/api/v1/veterinaria/usuarios")
public class UsuarioController extends SimpleCrudController<UsuarioDTO> {
    public UsuarioController(UsuarioService service) {
        super(service);
    }
}
