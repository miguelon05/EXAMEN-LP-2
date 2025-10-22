package com.example.repaso.veterinaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.repaso.veterinaria.dto.ClienteDTO;
import com.example.repaso.veterinaria.service.ClienteService;
import com.example.repaso.veterinaria.shared.SimpleCrudController;

@RestController
@RequestMapping("/api/v1/veterinaria/clientes")
public class ClienteController extends SimpleCrudController<ClienteDTO> {
    public ClienteController(ClienteService service) {
        super(service);
    }
}
