package com.exo1.exo1.mapper;

import com.exo1.exo1.DTO.AddressDTO;
import com.exo1.exo1.DTO.ComplementTypeDTO;
import com.exo1.exo1.DTO.PartyDTO;
import com.exo1.exo1.DTO.PartyTypeDTO;
import com.exo1.exo1.DTO.UsersDTO;
import com.exo1.exo1.entity.Address;
import com.exo1.exo1.entity.ComplementType;
import com.exo1.exo1.entity.Party;
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
public class PartyMapperImpl implements PartyMapper {

    @Override
    public PartyDTO toDTO(Party party) {
        if ( party == null ) {
            return null;
        }

        PartyDTO partyDTO = new PartyDTO();

        partyDTO.setId( party.getId() );
        partyDTO.setName( party.getName() );
        partyDTO.setDescription( party.getDescription() );
        partyDTO.setAddress( addressToAddressDTO( party.getAddress() ) );
        partyDTO.setComplement( party.getComplement() );
        partyDTO.setComplementTypesNeed( complementTypeToComplementTypeDTO( party.getComplementTypesNeed() ) );
        partyDTO.setComplementNeed( party.getComplementNeed() );
        partyDTO.setPaid( party.isPaid() );
        partyDTO.setPrice( party.getPrice() );
        partyDTO.setMinAge( party.getMinAge() );
        partyDTO.setCreator( usersToUsersDTO( party.getCreator() ) );
        partyDTO.setPartyType( partyTypeToPartyTypeDTO( party.getPartyType() ) );
        partyDTO.setCreated( party.getCreated() );

        return partyDTO;
    }

    @Override
    public Party toEntity(PartyDTO partyDTO) {
        if ( partyDTO == null ) {
            return null;
        }

        Party party = new Party();

        party.setId( partyDTO.getId() );
        party.setName( partyDTO.getName() );
        party.setDescription( partyDTO.getDescription() );
        party.setAddress( addressDTOToAddress( partyDTO.getAddress() ) );
        party.setComplement( partyDTO.getComplement() );
        party.setComplementTypesNeed( complementTypeDTOToComplementType( partyDTO.getComplementTypesNeed() ) );
        party.setComplementNeed( partyDTO.getComplementNeed() );
        party.setPaid( partyDTO.isPaid() );
        party.setPrice( partyDTO.getPrice() );
        party.setMinAge( partyDTO.getMinAge() );
        party.setCreator( usersDTOToUsers( partyDTO.getCreator() ) );
        party.setPartyType( partyTypeDTOToPartyType( partyDTO.getPartyType() ) );
        party.setCreated( partyDTO.getCreated() );

        return party;
    }

    @Override
    public List<PartyDTO> toDTOs(List<Party> partyList) {
        if ( partyList == null ) {
            return null;
        }

        List<PartyDTO> list = new ArrayList<PartyDTO>( partyList.size() );
        for ( Party party : partyList ) {
            list.add( toDTO( party ) );
        }

        return list;
    }

    @Override
    public List<Party> toEntities(List<PartyDTO> partyDTOList) {
        if ( partyDTOList == null ) {
            return null;
        }

        List<Party> list = new ArrayList<Party>( partyDTOList.size() );
        for ( PartyDTO partyDTO : partyDTOList ) {
            list.add( toEntity( partyDTO ) );
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

    protected ComplementTypeDTO complementTypeToComplementTypeDTO(ComplementType complementType) {
        if ( complementType == null ) {
            return null;
        }

        ComplementTypeDTO complementTypeDTO = new ComplementTypeDTO();

        complementTypeDTO.setId( complementType.getId() );
        complementTypeDTO.setValue( complementType.getValue() );

        return complementTypeDTO;
    }

    protected List<UsersDTO> usersSetToUsersDTOList(Set<Users> set) {
        if ( set == null ) {
            return null;
        }

        List<UsersDTO> list = new ArrayList<UsersDTO>( set.size() );
        for ( Users users : set ) {
            list.add( usersToUsersDTO( users ) );
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

    protected UsersDTO usersToUsersDTO(Users users) {
        if ( users == null ) {
            return null;
        }

        UsersDTO usersDTO = new UsersDTO();

        usersDTO.setId( users.getId() );
        usersDTO.setUsername( users.getUsername() );
        usersDTO.setPassword( users.getPassword() );
        usersDTO.setEmail( users.getEmail() );
        usersDTO.setPhone( users.getPhone() );
        usersDTO.setAge( users.getAge() );
        usersDTO.setAddress( addressToAddressDTO( users.getAddress() ) );
        usersDTO.setRating( users.getRating() );
        usersDTO.setHobbies( partyTypeSetToPartyTypeDTOList( users.getHobbies() ) );
        usersDTO.setCreated( users.getCreated() );

        return usersDTO;
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

    protected ComplementType complementTypeDTOToComplementType(ComplementTypeDTO complementTypeDTO) {
        if ( complementTypeDTO == null ) {
            return null;
        }

        ComplementType complementType = new ComplementType();

        complementType.setId( complementTypeDTO.getId() );
        complementType.setValue( complementTypeDTO.getValue() );

        return complementType;
    }

    protected Set<Users> usersDTOListToUsersSet(List<UsersDTO> list) {
        if ( list == null ) {
            return null;
        }

        Set<Users> set = new LinkedHashSet<Users>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( UsersDTO usersDTO : list ) {
            set.add( usersDTOToUsers( usersDTO ) );
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

    protected Users usersDTOToUsers(UsersDTO usersDTO) {
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
}
