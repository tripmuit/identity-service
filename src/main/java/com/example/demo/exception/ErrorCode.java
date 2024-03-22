package com.example.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    VALIDATED(1002, "Field not empty"),
    PASSWORD_INVALID(1003, "Password must be at least 8 character"),
    EMAIL_FORMAT(1004, "Email is not in correct format"),
    INVALID_KEY(1005, "Invalid message key"),
    USER_EXISTED(1001, "User existed"),
    UNAUTHENTICATED(1007, "unauthenticated"),
    UNCATEGORIZED_EXCEPTION(999, "uncategorized error"),
    USER_NOT_EXISTED(1006, "User not existed");


    private int Code;
    private String message;

}
