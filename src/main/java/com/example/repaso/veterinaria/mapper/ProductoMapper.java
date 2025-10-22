package com.example.repaso.veterinaria.mapper;

import org.mapstruct.Mapper;
import com.example.repaso.veterinaria.dto.ProductoDTO;
import com.example.repaso.veterinaria.entity.Producto;
import com.example.repaso.mappers.base.BaseMappers;

@Mapper(componentModel = "spring")
public interface ProductoMapper extends BaseMappers<Producto, ProductoDTO> {
}
