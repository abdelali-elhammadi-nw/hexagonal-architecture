package com.example.hexagonal.application.web;


import com.example.hexagonal.domaine.operation.Operation;
import com.example.hexagonal.domaine.operation.services.IOperationService;
import com.example.hexagonal.application.dto.OperationRequestDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/operations")
public class OperationController {

    private final IOperationService operationService;

    public OperationController(IOperationService OperationService) {
        operationService = OperationService;
    }

    @PostMapping("/withdraw")
    public Operation withdraw(@RequestBody OperationRequestDTO dto){
        return operationService.deposit(UUID.fromString(dto.getWalletId()), dto.getAmount());
    }

    @PostMapping("/deposit")
    public Operation deposit(@RequestBody OperationRequestDTO dto){
        return operationService.deposit(UUID.fromString(dto.getWalletId()), dto.getAmount());
    }

}
