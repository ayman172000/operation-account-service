package com.example.operationaccountmicroservice.entities;

import com.example.operationaccountmicroservice.enums.OperationType;
import com.example.operationaccountmicroservice.model.Compte;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor @NoArgsConstructor @Data
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long operationId;
    private Date operationDate;
    private double amount;
    @Enumerated(EnumType.STRING)
    private OperationType type;
    private Long compteId;
    @Transient
    private Compte compte;
    private String description;
}
