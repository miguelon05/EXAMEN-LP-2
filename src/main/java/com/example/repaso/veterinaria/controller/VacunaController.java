package com.example.repaso.veterinaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.repaso.veterinaria.dto.VacunaDTO;
import com.example.repaso.veterinaria.service.VacunaService;
import com.example.repaso.veterinaria.shared.SimpleCrudController;

@RestController
@RequestMapping("/api/v1/veterinaria/vacunas")
public class VacunaController extends SimpleCrudController<VacunaDTO> {
    public VacunaController(VacunaService service) {
        super(service);
    }
}
