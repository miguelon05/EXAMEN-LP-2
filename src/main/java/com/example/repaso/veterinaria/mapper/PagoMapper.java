package com.example.repaso.veterinaria.mapper;

import org.mapstruct.Mapper;
import com.example.repaso.veterinaria.dto.PagoDTO;
import com.example.repaso.veterinaria.entity.Pago;
import com.example.repaso.mappers.base.BaseMappers;

@Mapper(componentModel = "spring")
public interface PagoMapper extends BaseMappers<Pago, PagoDTO> {
}
