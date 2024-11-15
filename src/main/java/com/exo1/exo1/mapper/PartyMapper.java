package com.exo1.exo1.mapper;

import com.exo1.exo1.DTO.PartyDTO;
import com.exo1.exo1.entity.Party;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PartyPartcipantMapper.class})
public interface PartyMapper {
    PartyDTO toDTO(Party party);
    Party toEntity(PartyDTO partyDTO);
    List<PartyDTO> toDTOs(List<Party> partyList);
    List<Party> toEntities(List<PartyDTO> partyDTOList);
}
