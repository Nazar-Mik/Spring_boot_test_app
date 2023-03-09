package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            StudentEntity mariam = new StudentEntity(
                    "Mariam",
                    22,
                    LocalDate.of(2000, Month.JANUARY,5),
                    "Mariam@enmail.com"
            );

            StudentEntity alex = new StudentEntity(
                    "Alex",
                    27,
                    LocalDate.of(2010, Month.DECEMBER,12),
                    "Alex@enmail.com"
            );

            repository.saveAll(
                    List.of(mariam, alex)
            );
        };
    }
}
