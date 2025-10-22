package com.example.repaso.veterinaria.mapper;

import org.mapstruct.Mapper;
import com.example.repaso.veterinaria.dto.TratamientoDTO;
import com.example.repaso.veterinaria.entity.Tratamiento;
import com.example.repaso.mappers.base.BaseMappers;

@Mapper(componentModel = "spring")
public interface TratamientoMapper extends BaseMappers<Tratamiento, TratamientoDTO> {
}
