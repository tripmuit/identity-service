package com.example.demo.enity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Date;

import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    String id;

    @Column(name = "first_name")
    @NotBlank
    String firstName;

    @Column(name = "last_name")
    @NotBlank
    String lastName;

    @Column(name = "email")
    @NotBlank
    @Email
    String email;

    @Column(name = "password")
    @NotBlank
    String password;

    @Column(name = "dob")
    LocalDate dob;

    @ManyToMany
    Set<Role> roles;

}

