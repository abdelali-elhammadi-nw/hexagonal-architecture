package com.example.hexagonal.infra.repositories;

import com.example.hexagonal.infra.entities.WalletDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface WalletRepositoryJPA extends JpaRepository<WalletDB, UUID> {

}
