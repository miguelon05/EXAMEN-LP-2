package com.example.repaso.veterinaria.mapper;

import org.mapstruct.Mapper;
import com.example.repaso.veterinaria.dto.ClienteDTO;
import com.example.repaso.veterinaria.entity.Cliente;
import com.example.repaso.mappers.base.BaseMappers;

@Mapper(componentModel = "spring")
public interface ClienteMapper extends BaseMappers<Cliente, ClienteDTO> {
}
