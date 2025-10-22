package com.example.repaso.veterinaria.mapper;

import org.mapstruct.Mapper;
import com.example.repaso.veterinaria.dto.RolDTO;
import com.example.repaso.veterinaria.entity.Rol;
import com.example.repaso.mappers.base.BaseMappers;

@Mapper(componentModel = "spring")
public interface RolMapper extends BaseMappers<Rol, RolDTO> {
}
