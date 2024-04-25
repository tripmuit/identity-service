package com.example.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

@Getter

public enum ErrorCode {
    VALIDATED(1002, "Field not empty", HttpStatus.BAD_REQUEST),
    PASSWORD_INVALID(1003, "Password must be at least {min} character", HttpStatus.BAD_REQUEST),
    EMAIL_FORMAT(1004, "Email is not in correct format", HttpStatus.BAD_REQUEST),
    INVALID_KEY(1005, "Invalid message key", HttpStatus.BAD_REQUEST),
    USER_EXISTED(1001, "User existed", HttpStatus.BAD_REQUEST),
    UNAUTHENTICATED(1007, "unauthenticated", HttpStatus.UNAUTHORIZED),
    UNCATEGORIZED_EXCEPTION(999, "uncategorized error", HttpStatus.INTERNAL_SERVER_ERROR),
    INVALID_DOB(1009, "Your age must be at least {min}", HttpStatus.BAD_REQUEST),
    UNAUTHORIZED(1008, "You do not permission", HttpStatus.FORBIDDEN),
    USER_NOT_EXISTED(1006, "User not existed", HttpStatus.NOT_FOUND);

    ErrorCode(int code, String message, HttpStatusCode statusCode){
        this.code = code;
        this.message = message;
        this.statusCode = statusCode;
    }

    private int code;
    private String message;
    private HttpStatusCode statusCode;

}
