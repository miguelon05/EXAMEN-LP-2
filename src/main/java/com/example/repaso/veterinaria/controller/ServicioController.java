package com.example.repaso.veterinaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.repaso.veterinaria.dto.ServicioDTO;
import com.example.repaso.veterinaria.service.ServicioService;
import com.example.repaso.veterinaria.shared.SimpleCrudController;

@RestController
@RequestMapping("/api/v1/veterinaria/servicios")
public class ServicioController extends SimpleCrudController<ServicioDTO> {
    public ServicioController(ServicioService service) {
        super(service);
    }
}
