package com.example.repaso.veterinaria.mapper;

import org.mapstruct.Mapper;
import com.example.repaso.veterinaria.dto.HistorialClinicoDTO;
import com.example.repaso.veterinaria.entity.HistorialClinico;
import com.example.repaso.mappers.base.BaseMappers;

@Mapper(componentModel = "spring")
public interface HistorialClinicoMapper extends BaseMappers<HistorialClinico, HistorialClinicoDTO> {
}
