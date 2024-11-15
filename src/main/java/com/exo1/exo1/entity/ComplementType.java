package com.exo1.exo1.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "complement_type")
public class ComplementType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "complement_type_id")
    private Long id;

    @Column(nullable = false)
    private String value;

    @OneToOne(mappedBy = "complementType", cascade = CascadeType.ALL)
    private ComplementUnderType complemtUnderType;

}
