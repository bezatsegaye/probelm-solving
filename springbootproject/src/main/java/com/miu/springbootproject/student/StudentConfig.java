package com.miu.springbootproject.student;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Component
public class StudentConfig implements CommandLineRunner {

  private final  StudentRepository studentRepository;

    public StudentConfig(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<Student> students = new ArrayList<>();
        students.add(
                new Student(
                        1L,
                        "tse",
                        "ben",
                        "tseg@gmail.com",
                        LocalDate.of(2000, Month.JANUARY,12),
                        54));
         studentRepository.saveAll(students);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
//        return args -> {
//            List<Student> students = new ArrayList<>();
//            students.add(
//                    new Student(
//                            1L,
//                            "tse",
//                            "ben",
//                            "tseg@gmail.com",
//                            LocalDate.of(2000, Month.JANUARY,12),
//                            54));
//            studentRepository.saveAll(students);
//        };
//    }
}
