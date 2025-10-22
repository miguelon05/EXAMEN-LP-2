package com.example.repaso.veterinaria.mapper;

import org.mapstruct.Mapper;
import com.example.repaso.veterinaria.dto.DetalleHistorialDTO;
import com.example.repaso.veterinaria.entity.DetalleHistorial;
import com.example.repaso.mappers.base.BaseMappers;

@Mapper(componentModel = "spring")
public interface DetalleHistorialMapper extends BaseMappers<DetalleHistorial, DetalleHistorialDTO> {
}
