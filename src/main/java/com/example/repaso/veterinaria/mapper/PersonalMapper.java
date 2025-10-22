package com.example.repaso.veterinaria.mapper;

import org.mapstruct.Mapper;
import com.example.repaso.veterinaria.dto.PersonalDTO;
import com.example.repaso.veterinaria.entity.Personal;
import com.example.repaso.mappers.base.BaseMappers;

@Mapper(componentModel = "spring")
public interface PersonalMapper extends BaseMappers<Personal, PersonalDTO> {
}
