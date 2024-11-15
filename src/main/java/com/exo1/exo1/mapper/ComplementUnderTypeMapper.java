package com.exo1.exo1.mapper;

import com.exo1.exo1.DTO.ComplementUnderTypeDTO;
import com.exo1.exo1.entity.ComplementUnderType;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ComplementUnderTypeMapper {
    ComplementUnderTypeDTO toDTO(ComplementUnderType complementUnderType);
    ComplementUnderType toEntity(ComplementUnderTypeDTO complementUnderTypeDTO);
    List<ComplementUnderTypeDTO> toDTOs(List<ComplementUnderType> complementUnderTypes);
    List<ComplementUnderType> toEntities(List<ComplementUnderTypeDTO> complementUnderTypesDTO);
}
