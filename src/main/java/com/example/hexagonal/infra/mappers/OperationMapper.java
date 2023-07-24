package com.example.hexagonal.infra.mappers;

import com.example.hexagonal.domaine.operation.Operation;
import com.example.hexagonal.infra.entities.OperationDB;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OperationMapper {

    public OperationMapper INSTANCE = Mappers.getMapper(OperationMapper.class);

    public Operation operationDBToOperation(OperationDB operationDB);
    public OperationDB operationToOperationDB(Operation operation);

}
