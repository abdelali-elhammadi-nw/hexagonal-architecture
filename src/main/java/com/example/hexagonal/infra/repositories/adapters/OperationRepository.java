package com.example.hexagonal.infra.repositories.adapters;

import com.example.hexagonal.domaine.operation.Operation;
import com.example.hexagonal.domaine.ports.OperationRepositoryPort;
import com.example.hexagonal.infra.repositories.OperationRepositoryJPA;
import com.example.hexagonal.infra.entities.OperationDB;
import com.example.hexagonal.infra.mappers.OperationMapper;
import org.springframework.stereotype.Repository;

@Repository
public class OperationRepository implements OperationRepositoryPort {

    private final OperationRepositoryJPA operationRepositoryJPA;

    public OperationRepository(OperationRepositoryJPA operationRepositoryJPA) {
        this.operationRepositoryJPA = operationRepositoryJPA;
    }

    @Override
    public Operation save(Operation operation) {

        OperationDB operationDB = OperationMapper.INSTANCE.operationToOperationDB(operation);
        operationDB =  operationRepositoryJPA.save(operationDB);

        return  OperationMapper.INSTANCE.operationDBToOperation(operationDB);

    }
}
