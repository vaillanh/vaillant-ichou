package com.exo1.exo1.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersDTO {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String phone;
    private Timestamp age;
    private AddressDTO address;
    private float rating;
    private List<PartyTypeDTO> hobbies;
    private Timestamp created;
}
