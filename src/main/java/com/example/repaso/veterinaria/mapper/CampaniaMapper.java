package com.example.repaso.veterinaria.mapper;

import org.mapstruct.Mapper;
import com.example.repaso.veterinaria.dto.CampaniaDTO;
import com.example.repaso.veterinaria.entity.Campania;
import com.example.repaso.mappers.base.BaseMappers;

@Mapper(componentModel = "spring")
public interface CampaniaMapper extends BaseMappers<Campania, CampaniaDTO> {
}
