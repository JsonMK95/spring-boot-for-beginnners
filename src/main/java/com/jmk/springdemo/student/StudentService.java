package com.jmk.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents() {
        return List.of(
                new Student(
                        "Jason",
                        "Kim",
                        LocalDate.now(),
                        "contact@jasonkim.com",
                        30
                ),

                new Student(
                        "Ellie",
                        "Kim",
                        LocalDate.now(),
                        "contact@jasonkim.com",
                        27
                )
        );
    }
}
