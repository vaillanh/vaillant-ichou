package com.exo1.exo1.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "party_type")
public class PartyType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "party_type_id")
    private Long id;

    private String category;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_party_type", joinColumns = @JoinColumn(name = "party_type_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<Users> users;

    @OneToOne(mappedBy = "partyType", cascade = CascadeType.ALL)
    private ComplementUnderType complementUnderType;

}
