package com.example.repaso.veterinaria.service.impl;

import org.springframework.stereotype.Service;
import com.example.repaso.veterinaria.dto.PersonalDTO;
import com.example.repaso.veterinaria.entity.Personal;
import com.example.repaso.veterinaria.mapper.PersonalMapper;
import com.example.repaso.veterinaria.repository.PersonalRepository;
import com.example.repaso.veterinaria.service.PersonalService;
import com.example.repaso.veterinaria.shared.SimpleCrudService;

@Service
public class PersonalServiceImpl extends SimpleCrudService<Personal, PersonalDTO> implements PersonalService {
    public PersonalServiceImpl(PersonalRepository repository, PersonalMapper mapper) {
        super(repository, mapper);
    }
}
