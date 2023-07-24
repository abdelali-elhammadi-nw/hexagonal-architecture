package com.example.hexagonal.infra.repositories.adapters;

import com.example.hexagonal.domaine.client.Client;
import com.example.hexagonal.domaine.ports.ClientRepositoryPort;
import com.example.hexagonal.infra.repositories.ClientRepositoryJPA;
import com.example.hexagonal.infra.entities.ClientDB;
import com.example.hexagonal.infra.mappers.ClientMapper;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public class ClientRepository implements ClientRepositoryPort {

    private final ClientRepositoryJPA clientRepositoryJPA;

    public ClientRepository(ClientRepositoryJPA clientRepositoryJPA) {
        this.clientRepositoryJPA = clientRepositoryJPA;
    }

    @Override
    public Optional<Client> findById(UUID id) {

        Optional<ClientDB> clientDB = clientRepositoryJPA.findById(id);
        Client client = ClientMapper.INSTANCE.clientDBToClient(clientDB.get());

        return Optional.of(client);
    }

    @Override
    public Client save(Client client) {

        ClientDB clientDB = ClientMapper.INSTANCE.clientToClientDB(client);
        clientDB = clientRepositoryJPA.save(clientDB);
        System.out.println(clientDB);
        System.out.println(ClientMapper.INSTANCE.clientDBToClient(clientDB).getEmail());

        return ClientMapper.INSTANCE.clientDBToClient(clientDB);
    }
}
