package com.example.demo.dto.request;

import com.example.demo.validator.DobConstraint;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest {
    String id;
    String firstName;
    String lastName;
    String email;

    @Size(min = 8, message = "PASSWORD_INVALID")
    String password;

    @DobConstraint(min = 2, message = "INVALID_DOB")
    LocalDate dob;

}
