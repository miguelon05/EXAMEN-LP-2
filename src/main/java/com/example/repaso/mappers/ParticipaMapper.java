package com.example.repaso.mappers;

import com.example.repaso.dto.ParticipaDTO;
import com.example.repaso.entity.Participa;
import com.example.repaso.mappers.base.BaseMappers;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ParticipaMapper extends BaseMappers<Participa, ParticipaDTO>  {

    @Mapping(source = "proyecto.idProyecto", target = "proyectoId")
    @Mapping(source = "colaboradores.idColaborador", target = "colaboradorId")
    ParticipaDTO toDTO(Participa participa);

    @InheritInverseConfiguration
    Participa toEntity(ParticipaDTO participaDTO);
}
