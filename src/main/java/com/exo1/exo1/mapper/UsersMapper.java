package com.exo1.exo1.mapper;

import com.exo1.exo1.DTO.UsersDTO;
import com.exo1.exo1.entity.Users;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CommentaryMapper.class, PartyPartcipantMapper.class})
public interface UsersMapper {
    UsersDTO toDTO(Users user);
    Users toEntity(UsersDTO usersDTO);
    List<UsersDTO> toDTOs(List<Users> users);
    List<Users> toEntities(List<UsersDTO> usersDTO);
}
