package com.example.hexagonal.domaine.Wallet.services;

import com.example.hexagonal.domaine.Wallet.Wallet;

import java.util.UUID;

public interface IWalletService {

    public Wallet withdraw(UUID walletID, double amount);

    public Wallet deposit(UUID walletID,double amount);

    public Wallet createNewWallet(UUID clientId, Wallet wallet);
}
