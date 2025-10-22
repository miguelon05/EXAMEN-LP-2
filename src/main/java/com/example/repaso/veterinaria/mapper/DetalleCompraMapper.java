package com.example.repaso.veterinaria.mapper;

import org.mapstruct.Mapper;
import com.example.repaso.veterinaria.dto.DetalleCompraDTO;
import com.example.repaso.veterinaria.entity.DetalleCompra;
import com.example.repaso.mappers.base.BaseMappers;

@Mapper(componentModel = "spring")
public interface DetalleCompraMapper extends BaseMappers<DetalleCompra, DetalleCompraDTO> {
}
