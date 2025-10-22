package com.example.repaso.veterinaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.repaso.veterinaria.dto.TratamientoDTO;
import com.example.repaso.veterinaria.service.TratamientoService;
import com.example.repaso.veterinaria.shared.SimpleCrudController;

@RestController
@RequestMapping("/api/v1/veterinaria/tratamientos")
public class TratamientoController extends SimpleCrudController<TratamientoDTO> {
    public TratamientoController(TratamientoService service) {
        super(service);
    }
}
