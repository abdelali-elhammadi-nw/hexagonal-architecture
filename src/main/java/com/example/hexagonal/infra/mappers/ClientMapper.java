package com.example.hexagonal.infra.mappers;

import com.example.hexagonal.domaine.client.Client;
import com.example.hexagonal.infra.entities.ClientDB;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClientMapper {

    ClientMapper INSTANCE = Mappers.getMapper( ClientMapper.class );


    ClientDB clientToClientDB(Client client);
    Client clientDBToClient(ClientDB clientDB);

}
