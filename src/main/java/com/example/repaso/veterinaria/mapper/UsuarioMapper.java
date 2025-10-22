package com.example.repaso.veterinaria.mapper;

import org.mapstruct.Mapper;
import com.example.repaso.veterinaria.dto.UsuarioDTO;
import com.example.repaso.veterinaria.entity.Usuario;
import com.example.repaso.mappers.base.BaseMappers;

@Mapper(componentModel = "spring")
public interface UsuarioMapper extends BaseMappers<Usuario, UsuarioDTO> {
}
