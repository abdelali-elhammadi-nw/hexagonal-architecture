package com.example.hexagonal.infra.entities;

import com.example.hexagonal.domaine.Wallet.WalletType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Data
public class WalletDB {

    @Id
    @GeneratedValue(generator = "uuid-hibernate-generator")
    @GenericGenerator(name = "uuid-hibernate-generator", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    private double balance;

    private LocalDate creationDate;

    private WalletType type;

    @ManyToOne
    @JoinColumn(name = "client_id",nullable = false)
    private ClientDB client;
}
