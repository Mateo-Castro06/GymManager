package com.mateo.gymmanager.entity.person;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "person")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long idPerson;

    @Column(nullable = false)
    protected String firstName;

    protected String middleName;

    @Column(nullable = false)
    protected String lastName;

    @Column(nullable = false, unique = true)
    protected String dni;

    @Column(nullable = false)
    protected LocalDate birthDate;

}
