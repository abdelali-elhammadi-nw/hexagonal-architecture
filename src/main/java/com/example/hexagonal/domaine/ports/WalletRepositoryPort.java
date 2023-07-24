package com.example.hexagonal.domaine.ports;

import com.example.hexagonal.domaine.Wallet.Wallet;

import java.util.Optional;
import java.util.UUID;

public interface WalletRepositoryPort {

    public Optional<Wallet> findById(UUID id);

    public Wallet save(Wallet wallet);

}
