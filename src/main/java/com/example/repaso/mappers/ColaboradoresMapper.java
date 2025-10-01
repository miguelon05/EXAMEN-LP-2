package com.example.repaso.mappers;


import com.example.repaso.dto.ColaboradoresDTO;
import com.example.repaso.entity.Colaboradores;
import com.example.repaso.mappers.base.BaseMappers;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ColaboradoresMapper extends BaseMappers<Colaboradores, ColaboradoresDTO> {
}
