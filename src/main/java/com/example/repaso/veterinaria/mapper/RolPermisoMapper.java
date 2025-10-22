package com.example.repaso.veterinaria.mapper;

import org.mapstruct.Mapper;
import com.example.repaso.veterinaria.dto.RolPermisoDTO;
import com.example.repaso.veterinaria.entity.RolPermiso;
import com.example.repaso.mappers.base.BaseMappers;

@Mapper(componentModel = "spring")
public interface RolPermisoMapper extends BaseMappers<RolPermiso, RolPermisoDTO> {
}
