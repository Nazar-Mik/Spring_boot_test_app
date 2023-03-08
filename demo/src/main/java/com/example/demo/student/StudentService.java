package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<StudentEntity> getStudents() {
        return List.of(
                new StudentEntity(
                        1L,
                        "Marian",
                        22,
                        LocalDate.of(2000, Month.JANUARY,5),
                        "mariana@22.com"
                )
                
        );
    }
}
