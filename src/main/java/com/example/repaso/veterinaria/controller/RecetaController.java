package com.example.repaso.veterinaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.repaso.veterinaria.dto.RecetaDTO;
import com.example.repaso.veterinaria.service.RecetaService;
import com.example.repaso.veterinaria.shared.SimpleCrudController;

@RestController
@RequestMapping("/api/v1/veterinaria/recetas")
public class RecetaController extends SimpleCrudController<RecetaDTO> {
    public RecetaController(RecetaService service) {
        super(service);
    }
}
