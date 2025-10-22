package com.example.repaso.veterinaria.mapper;

import org.mapstruct.Mapper;
import com.example.repaso.veterinaria.dto.CategoriaProductoDTO;
import com.example.repaso.veterinaria.entity.CategoriaProducto;
import com.example.repaso.mappers.base.BaseMappers;

@Mapper(componentModel = "spring")
public interface CategoriaProductoMapper extends BaseMappers<CategoriaProducto, CategoriaProductoDTO> {
}
