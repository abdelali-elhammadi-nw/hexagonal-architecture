package com.example.hexagonal.infra.repositories;

import com.example.hexagonal.infra.entities.OperationDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OperationRepositoryJPA extends JpaRepository<OperationDB, UUID> {
}
