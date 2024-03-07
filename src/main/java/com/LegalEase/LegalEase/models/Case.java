package com.LegalEase.LegalEase.models;

import jakarta.persistence.Table;

import java.util.Date;

@Table(name = "cases")
public class Case {
    private int id;
    private Client client;
    private String caseType;
    private Date dateOfLoss;
    private boolean commercial;
    private boolean isClosed;
    private int totalCost;
    private int currentOffer;
    private int finalOffer;

}
