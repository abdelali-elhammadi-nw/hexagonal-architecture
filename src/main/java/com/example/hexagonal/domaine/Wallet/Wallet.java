package com.example.hexagonal.domaine.Wallet;

import com.example.hexagonal.domaine.client.Client;

import java.time.LocalDate;
import java.util.UUID;

public class Wallet {

    private UUID id;

    private double balance;


    private LocalDate creationDate;

    private WalletType type;

    private Client client;

    public Wallet(UUID id, double balance,LocalDate creationDate,WalletType type, Client client){
     this.id = id;
     this.balance = balance;
     this.creationDate = creationDate;
     this.type = type;
     this.client = client;
    }

    public void setClient(Client client){
        this.client = client;
    }
    public void withdraw(double amount){
        if(balance >= amount){
            this.balance -= amount;
        }
        else{
            throw new RuntimeException("you don't have enough money");
        }
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public UUID getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public WalletType getType() {
        return type;
    }

    public Client getClient() {
        return client;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public void setType(WalletType type) {
        this.type = type;

    }
}
