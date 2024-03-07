package com.LegalEase.LegalEase.models;

import com.LegalEase.LegalEase.enums.EmploymentStatusENUM;
import jakarta.persistence.Table;
import java.util.List;

@Table(name = "clients")
public class Client {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String country;
    private EmploymentStatusENUM.EmploymentStatus employmentStatus;
    private boolean isVeteran;
    private caseID caseID;

}
