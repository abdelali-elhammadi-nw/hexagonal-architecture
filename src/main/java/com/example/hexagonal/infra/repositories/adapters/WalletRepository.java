package com.example.hexagonal.infra.repositories.adapters;

import com.example.hexagonal.domaine.Wallet.Wallet;
import com.example.hexagonal.domaine.ports.WalletRepositoryPort;
import com.example.hexagonal.infra.repositories.WalletRepositoryJPA;
import com.example.hexagonal.infra.entities.WalletDB;
import com.example.hexagonal.infra.mappers.WalletMapper;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public class WalletRepository implements WalletRepositoryPort {

    private final WalletRepositoryJPA walletRepositoryJPA;

    public WalletRepository(WalletRepositoryJPA walletRepositoryJPA) {
        this.walletRepositoryJPA = walletRepositoryJPA;
    }

    @Override
    public Optional<Wallet> findById(UUID id) {
        Optional<WalletDB> walletDB = walletRepositoryJPA.findById(id);

        Wallet wallet = WalletMapper.INSTANCE.walletDBToWallet( walletDB.get() );

        return Optional.of(wallet);
    }

    @Override
    public Wallet save(Wallet wallet) {

        WalletDB walletDB = WalletMapper.INSTANCE.walletToWalletDB(wallet);
        walletDB = walletRepositoryJPA.save(walletDB);

        return WalletMapper.INSTANCE.walletDBToWallet(walletDB);
    }
}
