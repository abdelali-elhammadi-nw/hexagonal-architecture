package com.example.hexagonal.application.web;

import com.example.hexagonal.application.dto.WalletRequestDTO;
import com.example.hexagonal.domaine.Wallet.Wallet;
import com.example.hexagonal.domaine.Wallet.services.IWalletService;
import com.example.hexagonal.infra.mappers.WalletMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/wallets")
public class WalletController {

    private final IWalletService walletService;

    public WalletController(IWalletService walletService) {
        this.walletService = walletService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Wallet createWallet(@RequestBody WalletRequestDTO walletRequestDTO){

        Wallet wallet = WalletMapper.INSTANCE.walletRequestDTOToWallet(walletRequestDTO);

        return walletService.createNewWallet( UUID.fromString(walletRequestDTO.getClientId()), wallet);

    }
}
