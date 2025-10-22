package com.example.repaso.veterinaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.repaso.veterinaria.dto.HistorialClinicoDTO;
import com.example.repaso.veterinaria.service.HistorialClinicoService;
import com.example.repaso.veterinaria.shared.SimpleCrudController;

@RestController
@RequestMapping("/api/v1/veterinaria/historiales-clinicos")
public class HistorialClinicoController extends SimpleCrudController<HistorialClinicoDTO> {
    public HistorialClinicoController(HistorialClinicoService service) {
        super(service);
    }
}
