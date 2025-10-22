package com.example.repaso.veterinaria.service.impl;

import org.springframework.stereotype.Service;
import com.example.repaso.veterinaria.dto.ServicioDTO;
import com.example.repaso.veterinaria.entity.Servicio;
import com.example.repaso.veterinaria.mapper.ServicioMapper;
import com.example.repaso.veterinaria.repository.ServicioRepository;
import com.example.repaso.veterinaria.service.ServicioService;
import com.example.repaso.veterinaria.shared.SimpleCrudService;

@Service
public class ServicioServiceImpl extends SimpleCrudService<Servicio, ServicioDTO> implements ServicioService {
    public ServicioServiceImpl(ServicioRepository repository, ServicioMapper mapper) {
        super(repository, mapper);
    }
}
