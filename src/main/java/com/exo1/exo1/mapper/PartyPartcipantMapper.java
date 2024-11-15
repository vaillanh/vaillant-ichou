package com.exo1.exo1.mapper;

import com.exo1.exo1.DTO.PartyParticpantDTO;
import com.exo1.exo1.entity.PartyParticipant;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PartyPartcipantMapper {
    PartyParticpantDTO toDTO(PartyParticipant partyParticipant);
    PartyParticipant toEntity(PartyParticpantDTO partyParticpantDTO);
    List<PartyParticpantDTO> toDTOs(List<PartyParticipant> partyParticipants);
    List<PartyParticipant> toEntities(List<PartyParticpantDTO> partyParticipantDTOS);
}
