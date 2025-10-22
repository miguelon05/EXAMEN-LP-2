package com.example.repaso.veterinaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.repaso.veterinaria.dto.RecordatorioDTO;
import com.example.repaso.veterinaria.service.RecordatorioService;
import com.example.repaso.veterinaria.shared.SimpleCrudController;

@RestController
@RequestMapping("/api/v1/veterinaria/recordatorios")
public class RecordatorioController extends SimpleCrudController<RecordatorioDTO> {
    public RecordatorioController(RecordatorioService service) {
        super(service);
    }
}
