package com.example.demo.dto.request;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.swing.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiResponse <T> {
    private int code = 1000;
    private String message;
    private T result;
}
