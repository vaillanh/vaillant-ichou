package com.exo1.exo1.mapper;

import com.exo1.exo1.DTO.AddressDTO;
import com.exo1.exo1.DTO.PartyTypeDTO;
import com.exo1.exo1.DTO.UsersDTO;
import com.exo1.exo1.entity.Address;
import com.exo1.exo1.entity.PartyType;
import com.exo1.exo1.entity.Users;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-15T14:44:14+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 23 (Oracle Corporation)"
)
@Component
public class UsersMapperImpl implements UsersMapper {

    @Override
    public UsersDTO toDTO(Users user) {
        if ( user == null ) {
            return null;
        }

        UsersDTO usersDTO = new UsersDTO();

        usersDTO.setId( user.getId() );
        usersDTO.setUsername( user.getUsername() );
        usersDTO.setPassword( user.getPassword() );
        usersDTO.setEmail( user.getEmail() );
        usersDTO.setPhone( user.getPhone() );
        usersDTO.setAge( user.getAge() );
        usersDTO.setAddress( addressToAddressDTO( user.getAddress() ) );
        usersDTO.setRating( user.getRating() );
        usersDTO.setHobbies( partyTypeSetToPartyTypeDTOList( user.getHobbies() ) );
        usersDTO.setCreated( user.getCreated() );

        return usersDTO;
    }

    @Override
    public Users toEntity(UsersDTO usersDTO) {
        if ( usersDTO == null ) {
            return null;
        }

        Users users = new Users();

        users.setId( usersDTO.getId() );
        users.setUsername( usersDTO.getUsername() );
        users.setPassword( usersDTO.getPassword() );
        users.setEmail( usersDTO.getEmail() );
        users.setPhone( usersDTO.getPhone() );
        users.setAge( usersDTO.getAge() );
        users.setAddress( addressDTOToAddress( usersDTO.getAddress() ) );
        users.setRating( usersDTO.getRating() );
        users.setHobbies( partyTypeDTOListToPartyTypeSet( usersDTO.getHobbies() ) );
        users.setCreated( usersDTO.getCreated() );

        return users;
    }

    @Override
    public List<UsersDTO> toDTOs(List<Users> users) {
        if ( users == null ) {
            return null;
        }

        List<UsersDTO> list = new ArrayList<UsersDTO>( users.size() );
        for ( Users users1 : users ) {
            list.add( toDTO( users1 ) );
        }

        return list;
    }

    @Override
    public List<Users> toEntities(List<UsersDTO> usersDTO) {
        if ( usersDTO == null ) {
            return null;
        }

        List<Users> list = new ArrayList<Users>( usersDTO.size() );
        for ( UsersDTO usersDTO1 : usersDTO ) {
            list.add( toEntity( usersDTO1 ) );
        }

        return list;
    }

    protected AddressDTO addressToAddressDTO(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressDTO addressDTO = new AddressDTO();

        addressDTO.setId( address.getId() );
        addressDTO.setAddress( address.getAddress() );
        addressDTO.setCity( address.getCity() );

        return addressDTO;
    }

    protected List<UsersDTO> usersSetToUsersDTOList(Set<Users> set) {
        if ( set == null ) {
            return null;
        }

        List<UsersDTO> list = new ArrayList<UsersDTO>( set.size() );
        for ( Users users : set ) {
            list.add( toDTO( users ) );
        }

        return list;
    }

    protected PartyTypeDTO partyTypeToPartyTypeDTO(PartyType partyType) {
        if ( partyType == null ) {
            return null;
        }

        PartyTypeDTO partyTypeDTO = new PartyTypeDTO();

        partyTypeDTO.setId( partyType.getId() );
        partyTypeDTO.setCategory( partyType.getCategory() );
        partyTypeDTO.setUsers( usersSetToUsersDTOList( partyType.getUsers() ) );

        return partyTypeDTO;
    }

    protected List<PartyTypeDTO> partyTypeSetToPartyTypeDTOList(Set<PartyType> set) {
        if ( set == null ) {
            return null;
        }

        List<PartyTypeDTO> list = new ArrayList<PartyTypeDTO>( set.size() );
        for ( PartyType partyType : set ) {
            list.add( partyTypeToPartyTypeDTO( partyType ) );
        }

        return list;
    }

    protected Address addressDTOToAddress(AddressDTO addressDTO) {
        if ( addressDTO == null ) {
            return null;
        }

        Address address = new Address();

        address.setId( addressDTO.getId() );
        address.setAddress( addressDTO.getAddress() );
        address.setCity( addressDTO.getCity() );

        return address;
    }

    protected Set<Users> usersDTOListToUsersSet(List<UsersDTO> list) {
        if ( list == null ) {
            return null;
        }

        Set<Users> set = new LinkedHashSet<Users>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( UsersDTO usersDTO : list ) {
            set.add( toEntity( usersDTO ) );
        }

        return set;
    }

    protected PartyType partyTypeDTOToPartyType(PartyTypeDTO partyTypeDTO) {
        if ( partyTypeDTO == null ) {
            return null;
        }

        PartyType partyType = new PartyType();

        partyType.setId( partyTypeDTO.getId() );
        partyType.setCategory( partyTypeDTO.getCategory() );
        partyType.setUsers( usersDTOListToUsersSet( partyTypeDTO.getUsers() ) );

        return partyType;
    }

    protected Set<PartyType> partyTypeDTOListToPartyTypeSet(List<PartyTypeDTO> list) {
        if ( list == null ) {
            return null;
        }

        Set<PartyType> set = new LinkedHashSet<PartyType>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( PartyTypeDTO partyTypeDTO : list ) {
            set.add( partyTypeDTOToPartyType( partyTypeDTO ) );
        }

        return set;
    }
}
