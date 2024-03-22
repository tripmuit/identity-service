package com.example.demo.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    @NotEmpty(message = "VALIDATED")
    private String firstName;

    @NotEmpty(message = "VALIDATED")
    private String lastName;

    @NotEmpty(message = "VALIDATED")
    @Email(message = "EMAIL_FORMAT")
    private String email;

    @Size(min = 8, message = "PASSWORD_INVALID")
    @NotEmpty(message = "VALIDATED")
    private String password;

    private Date dateCreated;


}
