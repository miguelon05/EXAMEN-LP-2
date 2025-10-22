package com.example.repaso.veterinaria.mapper;

import org.mapstruct.Mapper;
import com.example.repaso.veterinaria.dto.ServicioDTO;
import com.example.repaso.veterinaria.entity.Servicio;
import com.example.repaso.mappers.base.BaseMappers;

@Mapper(componentModel = "spring")
public interface ServicioMapper extends BaseMappers<Servicio, ServicioDTO> {
}
