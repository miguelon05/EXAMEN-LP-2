package com.example.repaso.veterinaria.mapper;

import org.mapstruct.Mapper;
import com.example.repaso.veterinaria.dto.MetodoPagoDTO;
import com.example.repaso.veterinaria.entity.MetodoPago;
import com.example.repaso.mappers.base.BaseMappers;

@Mapper(componentModel = "spring")
public interface MetodoPagoMapper extends BaseMappers<MetodoPago, MetodoPagoDTO> {
}
