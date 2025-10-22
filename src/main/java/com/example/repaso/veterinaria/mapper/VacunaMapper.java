package com.example.repaso.veterinaria.mapper;

import org.mapstruct.Mapper;
import com.example.repaso.veterinaria.dto.VacunaDTO;
import com.example.repaso.veterinaria.entity.Vacuna;
import com.example.repaso.mappers.base.BaseMappers;

@Mapper(componentModel = "spring")
public interface VacunaMapper extends BaseMappers<Vacuna, VacunaDTO> {
}
