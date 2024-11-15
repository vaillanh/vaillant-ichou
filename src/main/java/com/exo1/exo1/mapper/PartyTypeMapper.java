package com.exo1.exo1.mapper;

import com.exo1.exo1.DTO.PartyTypeDTO;
import com.exo1.exo1.entity.PartyType;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring",uses = {ComplementTypeMapper.class})
public interface PartyTypeMapper {
    PartyTypeDTO toDTO(PartyType partyType);
    PartyType toEntity(PartyTypeDTO partyTypeDTO);
    List<PartyTypeDTO> toDTOs(List<PartyType> partyTypes);
    List<PartyType> toEntities(List<PartyTypeDTO> partyTypesDTO);
}
