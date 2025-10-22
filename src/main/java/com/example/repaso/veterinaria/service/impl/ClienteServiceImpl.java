package com.example.repaso.veterinaria.service.impl;

import org.springframework.stereotype.Service;
import com.example.repaso.veterinaria.dto.ClienteDTO;
import com.example.repaso.veterinaria.entity.Cliente;
import com.example.repaso.veterinaria.mapper.ClienteMapper;
import com.example.repaso.veterinaria.repository.ClienteRepository;
import com.example.repaso.veterinaria.service.ClienteService;
import com.example.repaso.veterinaria.shared.SimpleCrudService;

@Service
public class ClienteServiceImpl extends SimpleCrudService<Cliente, ClienteDTO> implements ClienteService {
    public ClienteServiceImpl(ClienteRepository repository, ClienteMapper mapper) {
        super(repository, mapper);
    }
}
