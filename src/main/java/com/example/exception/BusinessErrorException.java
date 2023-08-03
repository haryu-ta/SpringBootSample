package com.example.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BusinessErrorException extends Throwable {
    private String errorInfo;
}
