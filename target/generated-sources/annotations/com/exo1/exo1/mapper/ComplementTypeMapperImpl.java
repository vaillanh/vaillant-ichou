package com.exo1.exo1.mapper;

import com.exo1.exo1.DTO.ComplementTypeDTO;
import com.exo1.exo1.entity.ComplementType;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-15T14:44:14+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 23 (Oracle Corporation)"
)
@Component
public class ComplementTypeMapperImpl implements ComplementTypeMapper {

    @Override
    public ComplementTypeDTO toDTO(ComplementType complementType) {
        if ( complementType == null ) {
            return null;
        }

        ComplementTypeDTO complementTypeDTO = new ComplementTypeDTO();

        complementTypeDTO.setId( complementType.getId() );
        complementTypeDTO.setValue( complementType.getValue() );

        return complementTypeDTO;
    }

    @Override
    public ComplementType toEntity(ComplementTypeDTO complementTypeDTO) {
        if ( complementTypeDTO == null ) {
            return null;
        }

        ComplementType complementType = new ComplementType();

        complementType.setId( complementTypeDTO.getId() );
        complementType.setValue( complementTypeDTO.getValue() );

        return complementType;
    }

    @Override
    public List<ComplementTypeDTO> toDTOs(List<ComplementType> complementTypes) {
        if ( complementTypes == null ) {
            return null;
        }

        List<ComplementTypeDTO> list = new ArrayList<ComplementTypeDTO>( complementTypes.size() );
        for ( ComplementType complementType : complementTypes ) {
            list.add( toDTO( complementType ) );
        }

        return list;
    }

    @Override
    public List<ComplementType> toEntities(List<ComplementTypeDTO> complementTypesDTO) {
        if ( complementTypesDTO == null ) {
            return null;
        }

        List<ComplementType> list = new ArrayList<ComplementType>( complementTypesDTO.size() );
        for ( ComplementTypeDTO complementTypeDTO : complementTypesDTO ) {
            list.add( toEntity( complementTypeDTO ) );
        }

        return list;
    }
}
