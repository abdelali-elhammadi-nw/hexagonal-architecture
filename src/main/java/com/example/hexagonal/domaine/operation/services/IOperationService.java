package com.example.hexagonal.domaine.operation.services;

import com.example.hexagonal.domaine.operation.Operation;
import com.example.hexagonal.domaine.operation.OperationType;

import java.time.LocalDateTime;
import java.util.UUID;

public interface IOperationService {

    public Operation withdraw(UUID walletID, double amount);

    public Operation deposit(UUID walletID, double amount);

}
