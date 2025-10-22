package com.example.repaso.veterinaria.service.impl;

import org.springframework.stereotype.Service;
import com.example.repaso.veterinaria.dto.TratamientoDTO;
import com.example.repaso.veterinaria.entity.Tratamiento;
import com.example.repaso.veterinaria.mapper.TratamientoMapper;
import com.example.repaso.veterinaria.repository.TratamientoRepository;
import com.example.repaso.veterinaria.service.TratamientoService;
import com.example.repaso.veterinaria.shared.SimpleCrudService;

@Service
public class TratamientoServiceImpl extends SimpleCrudService<Tratamiento, TratamientoDTO> implements TratamientoService {
    public TratamientoServiceImpl(TratamientoRepository repository, TratamientoMapper mapper) {
        super(repository, mapper);
    }
}
