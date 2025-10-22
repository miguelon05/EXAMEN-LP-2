package com.example.repaso.veterinaria.mapper;

import org.mapstruct.Mapper;
import com.example.repaso.veterinaria.dto.InventarioDTO;
import com.example.repaso.veterinaria.entity.Inventario;
import com.example.repaso.mappers.base.BaseMappers;

@Mapper(componentModel = "spring")
public interface InventarioMapper extends BaseMappers<Inventario, InventarioDTO> {
}
