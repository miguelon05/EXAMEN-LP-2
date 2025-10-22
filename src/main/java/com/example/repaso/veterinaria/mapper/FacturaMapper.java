package com.example.repaso.veterinaria.mapper;

import org.mapstruct.Mapper;
import com.example.repaso.veterinaria.dto.FacturaDTO;
import com.example.repaso.veterinaria.entity.Factura;
import com.example.repaso.mappers.base.BaseMappers;

@Mapper(componentModel = "spring")
public interface FacturaMapper extends BaseMappers<Factura, FacturaDTO> {
}
