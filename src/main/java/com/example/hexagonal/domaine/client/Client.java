package com.example.hexagonal.domaine.client;

import com.example.hexagonal.domaine.Wallet.Wallet;

import javax.persistence.Entity;
import java.util.List;
import java.util.UUID;

public class Client {

    private UUID id;
    private String email;

    private String password;

    private String firstName;

    private String lastName;



    public UUID getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public void setId(UUID id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
