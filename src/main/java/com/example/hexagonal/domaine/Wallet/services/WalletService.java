package com.example.hexagonal.domaine.Wallet.services;

import com.example.hexagonal.domaine.Wallet.Wallet;
import com.example.hexagonal.domaine.client.Client;
import com.example.hexagonal.domaine.ports.ClientRepositoryPort;
import com.example.hexagonal.domaine.ports.WalletRepositoryPort;

import java.util.UUID;

public class WalletService implements IWalletService {

    private final WalletRepositoryPort walletRepositoryPort;
    private final ClientRepositoryPort clientRepositoryPort;

    public WalletService(WalletRepositoryPort walletRepositoryPort, ClientRepositoryPort clientRepositoryPort) {
        this.walletRepositoryPort = walletRepositoryPort;
        this.clientRepositoryPort = clientRepositoryPort;
    }

    public Wallet createNewWallet(UUID clientId, Wallet wallet){

        Client client = clientRepositoryPort.findById(clientId).orElseThrow(()->new RuntimeException("client not found"));
        wallet.setClient(client);
        return walletRepositoryPort.save(wallet);

    }

    public Wallet withdraw(UUID walletID, double amount){

        Wallet wallet = walletRepositoryPort.findById(walletID).orElseThrow(()->new RuntimeException("wallet not found"));
        wallet.withdraw(amount);
        walletRepositoryPort.save(wallet);

        return wallet;
    }

    public Wallet deposit(UUID walletID,double amount){

        Wallet wallet = walletRepositoryPort.findById(walletID).orElseThrow(()->new RuntimeException("wallet not found"));
        wallet.deposit(amount);
        walletRepositoryPort.save(wallet);

        return wallet;
    }
}
