package com.example.repaso.veterinaria.mapper;

import org.mapstruct.Mapper;
import com.example.repaso.veterinaria.dto.MedicamentoDTO;
import com.example.repaso.veterinaria.entity.Medicamento;
import com.example.repaso.mappers.base.BaseMappers;

@Mapper(componentModel = "spring")
public interface MedicamentoMapper extends BaseMappers<Medicamento, MedicamentoDTO> {
}
