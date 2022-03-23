package mili.ilyasse.tp3_2;

import mili.ilyasse.tp3_2.entities.patient;
import mili.ilyasse.tp3_2.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.Date;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class Tp32Application implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(Tp32Application.class, args);

    }

    @Override
    public void run(String... args) throws Exception {

        for (int i = 0; i < 100; i++) {
            patientRepository.save(new patient(null, "Ilyasse", new Date(), new Random().nextBoolean(), (int) (Math.random()*100)));

        }

        Page<patient> patientList= patientRepository.findAll(PageRequest.of(0,5));
        patientList.forEach(patient -> {
            System.out.println("======================");

            System.out.println(patient.getId());
            System.out.println(patient.getNom());
            System.out.println(patient.getScore());
            System.out.println(patient.getDateNaissance());
            System.out.println(patient.isMaladie());

        });
        System.out.println("======================");

        patient patient = patientRepository.findById(1L).orElseThrow(() -> new RuntimeException("Patient not Found"));
        if(patient!=null){
            System.out.println(patient.getNom());
            System.out.println(patient.isMaladie());
        }

        patient.setScore(360);
        patientRepository.save(patient);
        patientRepository.deleteById(1L);

    }
}
