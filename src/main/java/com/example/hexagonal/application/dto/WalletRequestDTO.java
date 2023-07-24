package com.example.hexagonal.application.dto;

import com.example.hexagonal.domaine.Wallet.WalletType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class WalletRequestDTO {

    private String clientId;
    private double balance;
    private WalletType type;

}
