package com.exo1.exo1.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long id;

    private String address;
    private String city;

    @OneToOne(mappedBy ="address", cascade = CascadeType.ALL)
    private Users user;

    @OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
    private Party party;
}
