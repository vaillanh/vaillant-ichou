package com.exo1.exo1.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartyDTO {
    private Long id;
    private String name;
    private String description;
    private AddressDTO address;
    private ComplementTypeDTO complementType;
    private String complement;
    private ComplementTypeDTO complementTypesNeed;
    private String complementNeed;
    private int nbPlace;
    private boolean paid;
    private int price;
    private int minAge;
    private UsersDTO creator;
    private PartyTypeDTO partyType;
    private Timestamp created;
}
