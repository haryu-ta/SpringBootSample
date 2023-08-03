package com.example.dto;

import lombok.Data;

@Data
public class AuthRequestDto {

    private String branchNumber;
    private String accountNumber;
    private String kanaName;
    private String password;

}
