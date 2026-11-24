package com.example.demo.repository;

import com.example.demo.model.Patient;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PatientRepository {

    private final JdbcClient jdbcClient;

    public PatientRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public List<Patient> findAll() {
        return jdbcClient.sql("""
                SELECT patient_id, first_name, last_name, date_of_birth, gender,
                       province, city, postal_code, phone_number, health_card_number,
                       primary_diagnosis, blood_type, last_visit_date
                FROM patients
                """)
                .query(Patient.class)
                .list();
    }

    public Optional<Patient> findById(Integer patientId) {
        return jdbcClient.sql("""
                SELECT patient_id, first_name, last_name, date_of_birth, gender,
                       province, city, postal_code, phone_number, health_card_number,
                       primary_diagnosis, blood_type, last_visit_date
                FROM patients
                WHERE patient_id = :patientId
                """)
                .param("patientId", patientId)
                .query(Patient.class)
                .optional();
    }

    public int save(Patient patient) {
        return jdbcClient.sql("""
                INSERT INTO patients (
                    first_name, last_name, date_of_birth, gender, province, city,
                    postal_code, phone_number, health_card_number, primary_diagnosis,
                    blood_type, last_visit_date
                ) VALUES (
                    :firstName, :lastName, :dateOfBirth, :gender, :province, :city,
                    :postalCode, :phoneNumber, :healthCardNumber, :primaryDiagnosis,
                    :bloodType, :lastVisitDate
                )
                """)
                .param("firstName", patient.firstName())
                .param("lastName", patient.lastName())
                .param("dateOfBirth", patient.dateOfBirth())
                .param("gender", patient.gender())
                .param("province", patient.province())
                .param("city", patient.city())
                .param("postalCode", patient.postalCode())
                .param("phoneNumber", patient.phoneNumber())
                .param("healthCardNumber", patient.healthCardNumber())
                .param("primaryDiagnosis", patient.primaryDiagnosis())
                .param("bloodType", patient.bloodType())
                .param("lastVisitDate", patient.lastVisitDate())
                .update();
    }

    public int deleteById(Integer patientId) {
        return jdbcClient.sql("DELETE FROM patients WHERE patient_id = :patientId")
                .param("patientId", patientId)
                .update();
    }
}

