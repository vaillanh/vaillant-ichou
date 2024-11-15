package com.exo1.exo1.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartyParticpantDTO {
    private Long id;
    private boolean accepted;
    private PartyDTO party;
    private UsersDTO user;
}
