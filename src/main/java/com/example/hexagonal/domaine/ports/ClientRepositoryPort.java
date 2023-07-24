package com.example.hexagonal.domaine.ports;

import com.example.hexagonal.domaine.client.Client;

import java.util.Optional;
import java.util.UUID;

public interface ClientRepositoryPort {

    public Optional<Client> findById(UUID id);

    public Client save(Client client);

}
