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
public class UwhizUser {


    public UwhizUser() {

    }

    public UwhizUser(String email, String passwordHash) {
        this.email = email;
        this.passwordHash = passwordHash;
        this.fullName = email;
    }


    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Email
    @NotNull
    @Column(length = 100, unique = true, nullable = false)
    String email;

    @Column(length = 255, unique = true, nullable = false)
    String fullName;

    @NotNull
    @Column
    String passwordHash;

    @Override
    public String toString() {
        return "UwhizUser{" +
                "email='" + email + '\'' +
                ", id=" + id +
                '}';
    }
}
