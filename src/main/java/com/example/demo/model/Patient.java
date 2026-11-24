package com.example.demo.model;

public record Patient(
        Integer patientId,
        String firstName,
        String lastName,
        String dateOfBirth,
        String gender,
        String province,
        String city,
        String postalCode,
        String phoneNumber,
        String healthCardNumber,
        String primaryDiagnosis,
        String bloodType,
        String lastVisitDate
) {}
