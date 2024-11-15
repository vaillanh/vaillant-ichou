package com.exo1.exo1.mapper;

import com.exo1.exo1.DTO.ComplementTypeDTO;
import com.exo1.exo1.entity.ComplementType;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ComplementTypeMapper.class, PartyMapper.class})
public interface ComplementTypeMapper {
    ComplementTypeDTO toDTO(ComplementType complementType);
    ComplementType toEntity(ComplementTypeDTO complementTypeDTO);
    List<ComplementTypeDTO> toDTOs(List<ComplementType> complementTypes);
    List<ComplementType> toEntities(List<ComplementTypeDTO> complementTypesDTO);
}
