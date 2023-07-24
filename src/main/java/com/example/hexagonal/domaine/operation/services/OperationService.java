package com.example.hexagonal.domaine.operation.services;

import com.example.hexagonal.domaine.Wallet.Wallet;
import com.example.hexagonal.domaine.Wallet.services.IWalletService;
import com.example.hexagonal.domaine.operation.Operation;
import com.example.hexagonal.domaine.operation.OperationType;
import com.example.hexagonal.domaine.ports.OperationRepositoryPort;

import java.time.LocalDateTime;
import java.util.UUID;

public class OperationService implements IOperationService{

    private final OperationRepositoryPort operationRepositoryPort;
    private final IWalletService walletService;

    public OperationService(OperationRepositoryPort operationRepositoryPort, IWalletService walletService) {
        this.operationRepositoryPort = operationRepositoryPort;
        this.walletService = walletService;
    }

    public Operation withdraw(UUID walletID, double amount){

        Wallet sender = walletService.withdraw(walletID,amount);
        Operation operation = new Operation(null, OperationType.WITHDRAW, LocalDateTime.now(),sender , null);
        operation = operationRepositoryPort.save(operation);

        return operation;
    }

    public Operation deposit(UUID walletID, double amount){

        Wallet receiver = walletService.deposit(walletID,amount);
        Operation operation = new Operation(null,OperationType.DEPOSIT, LocalDateTime.now(), null, receiver);
        operation = operationRepositoryPort.save(operation);

        return operation;
    }

}
