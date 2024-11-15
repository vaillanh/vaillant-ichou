package com.exo1.exo1.entity;


import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class  Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;

    //Info perso
    @Column(unique = true, nullable = false)
    private String email;
    @Column(unique = true, nullable = false)
    private String phone;
    @Column(nullable = false)
    private Timestamp age;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    //Party info
    private float rating;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_party_type", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "party_type_id"))
    private Set<PartyType> hobbies;

    @OneToOne(mappedBy = "creator", cascade = CascadeType.ALL)
    private Party party;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Commentary comments;

    @OneToOne(mappedBy = "author", cascade = CascadeType.ALL)
    private Commentary writedComments;

    @Column(nullable = false)
    private Timestamp created;
}
