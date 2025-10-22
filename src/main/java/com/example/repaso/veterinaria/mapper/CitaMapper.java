package com.example.repaso.veterinaria.mapper;

import org.mapstruct.Mapper;
import com.example.repaso.veterinaria.dto.CitaDTO;
import com.example.repaso.veterinaria.entity.Cita;
import com.example.repaso.mappers.base.BaseMappers;

@Mapper(componentModel = "spring")
public interface CitaMapper extends BaseMappers<Cita, CitaDTO> {
}
