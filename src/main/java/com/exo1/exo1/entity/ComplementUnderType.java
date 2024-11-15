package com.exo1.exo1.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "complement_under_type")
public class ComplementUnderType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "complement_under_type_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "complement_type_id")
    private ComplementType complementType;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "party_type_id")
    private PartyType partyType;
}
