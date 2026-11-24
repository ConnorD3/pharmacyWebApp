INSERT INTO patients (
    first_name, last_name, date_of_birth, gender, province, city,
    postal_code, phone_number, health_card_number, primary_diagnosis,
    blood_type, last_visit_date
    )
    SELECT first_name, last_name, date_of_birth, gender, province, city,
    postal_code, phone_number, health_card_number, primary_diagnosis,
    blood_type, last_visit_date FROM CSVREAD('classpath:patientData.csv');
