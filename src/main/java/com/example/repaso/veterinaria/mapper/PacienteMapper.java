package com.example.repaso.veterinaria.mapper;

import org.mapstruct.Mapper;
import com.example.repaso.veterinaria.dto.PacienteDTO;
import com.example.repaso.veterinaria.entity.Paciente;
import com.example.repaso.mappers.base.BaseMappers;

@Mapper(componentModel = "spring")
public interface PacienteMapper extends BaseMappers<Paciente, PacienteDTO> {
}
