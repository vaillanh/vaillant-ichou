package com.exo1.exo1.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartyTypeDTO {
    private Long id;
    private String category;
    private List<UsersDTO> users;
}
