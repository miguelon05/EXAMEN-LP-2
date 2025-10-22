package com.example.repaso.veterinaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.repaso.veterinaria.dto.MetodoPagoDTO;
import com.example.repaso.veterinaria.service.MetodoPagoService;
import com.example.repaso.veterinaria.shared.SimpleCrudController;

@RestController
@RequestMapping("/api/v1/veterinaria/metodos-pago")
public class MetodoPagoController extends SimpleCrudController<MetodoPagoDTO> {
    public MetodoPagoController(MetodoPagoService service) {
        super(service);
    }
}
