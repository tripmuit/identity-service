package com.example.demo.dto.response;

import com.example.demo.enity.Role;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponse {

    String id;
    String firstName;
    String lastName;
    String email;
    LocalDate dob;
    Set<RoleResponse> roles;

}
