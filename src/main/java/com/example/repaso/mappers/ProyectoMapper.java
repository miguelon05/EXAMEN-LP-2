package com.example.repaso.mappers;

import com.example.repaso.dto.ProyectoDTO;
import com.example.repaso.entity.Proyecto;
import com.example.repaso.mappers.base.BaseMappers;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ClienteMapper.class, ParticipaMapper.class})
public interface ProyectoMapper extends BaseMappers<Proyecto, ProyectoDTO> {
}