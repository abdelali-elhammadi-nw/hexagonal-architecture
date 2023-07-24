package com.example.hexagonal;


import com.example.hexagonal.domaine.Wallet.services.IWalletService;
import com.example.hexagonal.domaine.Wallet.services.WalletService;
import com.example.hexagonal.domaine.client.services.ClientService;
import com.example.hexagonal.domaine.client.services.IClientService;
import com.example.hexagonal.domaine.operation.services.IOperationService;
import com.example.hexagonal.domaine.operation.services.OperationService;
import com.example.hexagonal.domaine.ports.ClientRepositoryPort;
import com.example.hexagonal.domaine.ports.OperationRepositoryPort;
import com.example.hexagonal.domaine.ports.WalletRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {


    @Bean
    public IOperationService operationServiceBean(OperationRepositoryPort operationRepository, IWalletService walletService){
        return new OperationService(operationRepository, walletService);
    }

    @Bean
    public IWalletService walletServiceBean(WalletRepositoryPort walletRepository,ClientRepositoryPort clientRepository){
        return new WalletService(walletRepository, clientRepository);
    }

    @Bean
    public IClientService clientServiceBean(ClientRepositoryPort clientRepository, IWalletService walletService){
        return new ClientService(clientRepository, walletService);
    }

}
