package com.example.repaso.veterinaria.mapper;

import org.mapstruct.Mapper;
import com.example.repaso.veterinaria.dto.CompraDTO;
import com.example.repaso.veterinaria.entity.Compra;
import com.example.repaso.mappers.base.BaseMappers;

@Mapper(componentModel = "spring")
public interface CompraMapper extends BaseMappers<Compra, CompraDTO> {
}
