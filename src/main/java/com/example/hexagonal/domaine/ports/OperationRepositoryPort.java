package com.example.hexagonal.domaine.ports;

import com.example.hexagonal.domaine.operation.Operation;

public interface OperationRepositoryPort {

    public Operation save(Operation operation);

}
