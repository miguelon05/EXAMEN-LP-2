package com.example.repaso.veterinaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.repaso.veterinaria.dto.PacienteDTO;
import com.example.repaso.veterinaria.service.PacienteService;
import com.example.repaso.veterinaria.shared.SimpleCrudController;

@RestController
@RequestMapping("/api/v1/veterinaria/pacientes")
public class PacienteController extends SimpleCrudController<PacienteDTO> {
    public PacienteController(PacienteService service) {
        super(service);
    }
}
