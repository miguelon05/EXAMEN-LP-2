package com.example.repaso.veterinaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.repaso.veterinaria.dto.CitaDTO;
import com.example.repaso.veterinaria.service.CitaService;
import com.example.repaso.veterinaria.shared.SimpleCrudController;

@RestController
@RequestMapping("/api/v1/veterinaria/citas")
public class CitaController extends SimpleCrudController<CitaDTO> {
    public CitaController(CitaService service) {
        super(service);
    }
}
