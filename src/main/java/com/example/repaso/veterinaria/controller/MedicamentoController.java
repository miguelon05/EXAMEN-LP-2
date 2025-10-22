package com.example.repaso.veterinaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.repaso.veterinaria.dto.MedicamentoDTO;
import com.example.repaso.veterinaria.service.MedicamentoService;
import com.example.repaso.veterinaria.shared.SimpleCrudController;

@RestController
@RequestMapping("/api/v1/veterinaria/medicamentos")
public class MedicamentoController extends SimpleCrudController<MedicamentoDTO> {
    public MedicamentoController(MedicamentoService service) {
        super(service);
    }
}
