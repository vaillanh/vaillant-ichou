package com.exo1.exo1.mapper;

import com.exo1.exo1.DTO.AddressDTO;
import com.exo1.exo1.entity.Address;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring",uses = {PartyMapper.class, UsersMapper.class})
public interface AddressMapper {
    Address toEntity(AddressDTO addressDTO);
    AddressDTO toDTO(Address address);
    List<Address>  toEntities(List<AddressDTO> addressDTOList);
    List<AddressDTO> toDTOs(List<Address> addressList);
}
