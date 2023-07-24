package com.example.hexagonal.domaine.operation;

import com.example.hexagonal.domaine.Wallet.Wallet;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Operation {

    private UUID id;

    private OperationType type;

    private LocalDateTime dateTime;

    private Wallet receiver;

    private Wallet sender;

    public Operation(UUID id, OperationType type,LocalDateTime dateTime,Wallet sender, Wallet receiver){

        this.id = id;
        this.type = type;
        this.dateTime = dateTime;
        this.receiver = receiver;
        this.sender = sender;

    }

    public UUID getId() {
        return id;
    }

    public OperationType getType() {
        return type;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Wallet getReceiver() {
        return receiver;
    }

    public Wallet getSender() {
        return sender;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setType(OperationType type) {
        this.type = type;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void setReceiver(Wallet receiver) {
        this.receiver = receiver;
    }

    public void setSender(Wallet sender) {
        this.sender = sender;
    }
}
