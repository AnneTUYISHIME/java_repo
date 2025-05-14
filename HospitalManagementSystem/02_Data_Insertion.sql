INSERT INTO doctors (first_name, last_name, specialty, phone_number, email)
VALUES
('Alice', 'Johnson', 'Cardiology', '0788000001', 'alice.johnson@hospital.com'),
('Bob', 'Smith', 'Pediatrics', '0788000002', 'bob.smith@hospital.com'),
('Clara', 'Ngabo', 'Neurology', '0788000003', 'clara.ngabo@hospital.com');

-- Insert sample data into patients
INSERT INTO patients (first_name, last_name, date_of_birth, gender, phone_number, email)
VALUES
('John', 'Doe', '1990-05-15', 'Male', '0788555123', 'john.doe@gmail.com'),
('Jane', 'Twizeyimana', '1985-11-23', 'Female', '0788555124', 'jane.twi@gmail.com'),
('Eric', 'Mugisha', '2000-01-10', 'Male', '0788555125', 'eric.mugi@gmail.com');

-- Create some appointments
INSERT INTO appointments (doctor_id, patient_id, appointment_date, status)
VALUES
(1, 1, '2025-05-20 10:00:00', 'Scheduled'),
(2, 2, '2025-05-21 11:30:00', 'Completed'),
(3, 3, '2025-05-22 09:00:00', 'Canceled');

-- Create some medical records
INSERT INTO medical_records (patient_id, diagnosis, treatment, doctor_id)
VALUES
(1, 'Flu', 'Rest and hydration', 1),
(2, 'Migraine', 'Painkillers and rest', 2),
(3, 'Epilepsy', 'Anti-seizure medication', 3);

-- Insert into doctor_patient pivot table
INSERT INTO doctor_patient (doctor_id, patient_id)
VALUES
(1, 1),
(1, 2),
(2, 2),
(3, 3);