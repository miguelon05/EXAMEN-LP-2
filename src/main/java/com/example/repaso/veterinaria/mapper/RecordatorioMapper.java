package com.example.repaso.veterinaria.mapper;

import org.mapstruct.Mapper;
import com.example.repaso.veterinaria.dto.RecordatorioDTO;
import com.example.repaso.veterinaria.entity.Recordatorio;
import com.example.repaso.mappers.base.BaseMappers;

@Mapper(componentModel = "spring")
public interface RecordatorioMapper extends BaseMappers<Recordatorio, RecordatorioDTO> {
}
