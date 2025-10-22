package com.example.repaso.veterinaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.repaso.veterinaria.dto.PagoDTO;
import com.example.repaso.veterinaria.service.PagoService;
import com.example.repaso.veterinaria.shared.SimpleCrudController;

@RestController
@RequestMapping("/api/v1/veterinaria/pagos")
public class PagoController extends SimpleCrudController<PagoDTO> {
    public PagoController(PagoService service) {
        super(service);
    }
}
