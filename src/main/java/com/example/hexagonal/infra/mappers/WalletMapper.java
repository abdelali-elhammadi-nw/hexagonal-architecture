package com.example.hexagonal.infra.mappers;

import com.example.hexagonal.domaine.Wallet.Wallet;
import com.example.hexagonal.infra.entities.WalletDB;
import com.example.hexagonal.application.dto.WalletRequestDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface WalletMapper {

    public WalletMapper INSTANCE = Mappers.getMapper( WalletMapper.class );

    @Mapping(target = "creationDate",ignore = true)
    @Mapping(target = "client",ignore = true)
    @Mapping(target = "id",ignore = true)
    public Wallet walletRequestDTOToWallet(WalletRequestDTO walletRequestDTO);

    public Wallet walletDBToWallet(WalletDB walletDB);
    public WalletDB walletToWalletDB(Wallet wallet);

}
