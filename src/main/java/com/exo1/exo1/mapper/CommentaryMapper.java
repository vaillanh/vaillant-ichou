package com.exo1.exo1.mapper;

import com.exo1.exo1.DTO.CommentaryDTO;
import com.exo1.exo1.entity.Commentary;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CommentaryMapper {
    CommentaryDTO toDTO(Commentary commentary);
    Commentary toEntity(CommentaryDTO commentaryDTO);
    List<CommentaryDTO> toDTOs(List<Commentary> commentaryList);
    List<Commentary> toEntities(List<CommentaryDTO> commentaryDTOList);
}
