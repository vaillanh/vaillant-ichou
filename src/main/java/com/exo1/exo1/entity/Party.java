package com.exo1.exo1.entity;


import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "party")
public class Party {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "party_id")
    private Long id;

    //Info global
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;


    //Info address
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    //Info Complément
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "complement_type_id")
    private ComplementType complementTypes;
    @Column(nullable = false)
    private String complement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "complement_type_need_id")
    private ComplementType complementTypesNeed;
    @Column(nullable = false)
    private String complementNeed;

    //Info invité
    @Column(nullable = false)
    private int nbplace;
    @Column(nullable = false)
    private boolean paid;
    @Column(nullable = false)//default 0
    private int price;
    @Column(nullable = false)//default 18
    private int minAge;



    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "creator", nullable = false)
    private Users creator;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "party",nullable = false)
    private PartyType partyType;

    @Column(nullable = false)
    private Timestamp created;

    @OneToMany(mappedBy ="party",fetch = FetchType.LAZY)
    private Set<PartyParticipant> partyParticipants;
}
