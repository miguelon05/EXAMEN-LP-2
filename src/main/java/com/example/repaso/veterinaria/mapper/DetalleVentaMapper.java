package com.example.repaso.veterinaria.mapper;

import org.mapstruct.Mapper;
import com.example.repaso.veterinaria.dto.DetalleVentaDTO;
import com.example.repaso.veterinaria.entity.DetalleVenta;
import com.example.repaso.mappers.base.BaseMappers;

@Mapper(componentModel = "spring")
public interface DetalleVentaMapper extends BaseMappers<DetalleVenta, DetalleVentaDTO> {
}
