package com.exo1.exo1.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComplementUnderTypeDTO {
    private Long id;
    private String name;
    private PartyTypeDTO partyType;
    private ComplementTypeDTO complementType;
}
