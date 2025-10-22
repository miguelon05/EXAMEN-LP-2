package com.example.repaso.veterinaria.service.impl;

import org.springframework.stereotype.Service;
import com.example.repaso.veterinaria.dto.UsuarioDTO;
import com.example.repaso.veterinaria.entity.Usuario;
import com.example.repaso.veterinaria.mapper.UsuarioMapper;
import com.example.repaso.veterinaria.repository.UsuarioRepository;
import com.example.repaso.veterinaria.service.UsuarioService;
import com.example.repaso.veterinaria.shared.SimpleCrudService;

@Service
public class UsuarioServiceImpl extends SimpleCrudService<Usuario, UsuarioDTO> implements UsuarioService {
    public UsuarioServiceImpl(UsuarioRepository repository, UsuarioMapper mapper) {
        super(repository, mapper);
    }
}
