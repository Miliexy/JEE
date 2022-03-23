package mili.ilyasse.tp3_2.repositories;

import mili.ilyasse.tp3_2.entities.patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<patient, Long> {
}
