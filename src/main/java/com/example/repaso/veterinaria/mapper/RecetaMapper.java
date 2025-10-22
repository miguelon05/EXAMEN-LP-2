package com.example.repaso.veterinaria.mapper;

import org.mapstruct.Mapper;
import com.example.repaso.veterinaria.dto.RecetaDTO;
import com.example.repaso.veterinaria.entity.Receta;
import com.example.repaso.mappers.base.BaseMappers;

@Mapper(componentModel = "spring")
public interface RecetaMapper extends BaseMappers<Receta, RecetaDTO> {
}
