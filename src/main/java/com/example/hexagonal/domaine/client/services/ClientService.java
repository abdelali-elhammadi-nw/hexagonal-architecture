package com.example.hexagonal.domaine.client.services;

import com.example.hexagonal.domaine.Wallet.services.IWalletService;
import com.example.hexagonal.domaine.client.Client;
import com.example.hexagonal.domaine.ports.ClientRepositoryPort;

public class ClientService implements IClientService {

    private  final ClientRepositoryPort clientRepositoryPort;
    private  final IWalletService walletService;

    public ClientService(ClientRepositoryPort clientRepositoryPort, IWalletService walletService) {
        this.clientRepositoryPort = clientRepositoryPort;
        this.walletService = walletService;
    }

    public Client createClient(Client client){

        client = clientRepositoryPort.save(client);
        return client;

    }

}
