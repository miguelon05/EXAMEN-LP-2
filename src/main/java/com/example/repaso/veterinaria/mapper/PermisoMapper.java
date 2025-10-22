package com.example.repaso.veterinaria.mapper;

import org.mapstruct.Mapper;
import com.example.repaso.veterinaria.dto.PermisoDTO;
import com.example.repaso.veterinaria.entity.Permiso;
import com.example.repaso.mappers.base.BaseMappers;

@Mapper(componentModel = "spring")
public interface PermisoMapper extends BaseMappers<Permiso, PermisoDTO> {
}
