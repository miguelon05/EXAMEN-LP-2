package com.example.repaso.veterinaria.mapper;

import org.mapstruct.Mapper;
import com.example.repaso.veterinaria.dto.ProveedorDTO;
import com.example.repaso.veterinaria.entity.Proveedor;
import com.example.repaso.mappers.base.BaseMappers;

@Mapper(componentModel = "spring")
public interface ProveedorMapper extends BaseMappers<Proveedor, ProveedorDTO> {
}
