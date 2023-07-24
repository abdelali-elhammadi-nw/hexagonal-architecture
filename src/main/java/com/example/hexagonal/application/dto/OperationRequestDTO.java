package com.example.hexagonal.application.dto;

import lombok.Data;

@Data
public class OperationRequestDTO {

    private String walletId;
    private double amount;

}
