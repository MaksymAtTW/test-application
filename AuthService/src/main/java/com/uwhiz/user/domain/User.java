package com.uwhiz.user.domain;


import lombok.Data;
import lombok.Getter;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "user")
public class User {


    public User() {

    }

    public User(String email, String fullName) {
        this.email = email;
        this.fullName = fullName;
    }


    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Email
    @NotNull
    @Column(length = 100, unique = true, nullable = false)
    String email;

    @NotNull
    @Column(length = 255, unique = true, nullable = false)
    String fullName;

    @NotNull
    @Column
    String passwordHash;

}
