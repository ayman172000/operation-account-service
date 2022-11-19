package com.example.operationaccountmicroservice.model;

import com.example.operationaccountmicroservice.enums.AccountStatus;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
public abstract class Compte {
    private Long id;
    private double balance;
    private Date createdAt;
    @Enumerated(EnumType.STRING)
    private AccountStatus status;
    private Client client;
}
