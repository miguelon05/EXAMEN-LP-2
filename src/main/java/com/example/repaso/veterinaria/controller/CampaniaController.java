package com.example.repaso.veterinaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.repaso.veterinaria.dto.CampaniaDTO;
import com.example.repaso.veterinaria.service.CampaniaService;
import com.example.repaso.veterinaria.shared.SimpleCrudController;

@RestController
@RequestMapping("/api/v1/veterinaria/campanias")
public class CampaniaController extends SimpleCrudController<CampaniaDTO> {
    public CampaniaController(CampaniaService service) {
        super(service);
    }
}
