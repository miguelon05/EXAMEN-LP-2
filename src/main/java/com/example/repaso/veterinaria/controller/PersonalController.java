package com.example.repaso.veterinaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.repaso.veterinaria.dto.PersonalDTO;
import com.example.repaso.veterinaria.service.PersonalService;
import com.example.repaso.veterinaria.shared.SimpleCrudController;

@RestController
@RequestMapping("/api/v1/veterinaria/personal")
public class PersonalController extends SimpleCrudController<PersonalDTO> {
    public PersonalController(PersonalService service) {
        super(service);
    }
}
