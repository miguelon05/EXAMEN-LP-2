package com.example.repaso.veterinaria.mapper;

import org.mapstruct.Mapper;
import com.example.repaso.veterinaria.dto.VentaDTO;
import com.example.repaso.veterinaria.entity.Venta;
import com.example.repaso.mappers.base.BaseMappers;

@Mapper(componentModel = "spring")
public interface VentaMapper extends BaseMappers<Venta, VentaDTO> {
}
