package com.pradipta.reportsuspect.apis.contacttracing.model.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.Optional;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;
    public Optional<Patient> findPatient(Long patientId) {
        return patientRepository.findById(patientId);
    }
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }
}