package com.example.repaso.veterinaria.mapper;

import org.mapstruct.Mapper;
import com.example.repaso.veterinaria.dto.UsuarioRolDTO;
import com.example.repaso.veterinaria.entity.UsuarioRol;
import com.example.repaso.mappers.base.BaseMappers;

@Mapper(componentModel = "spring")
public interface UsuarioRolMapper extends BaseMappers<UsuarioRol, UsuarioRolDTO> {
}
