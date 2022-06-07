package com.miu.springbootproject.student;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
//        List<Student> students = new ArrayList<>();
//        students.add(
//                new Student(
//                        1L,
//                        "tse",
//                        "ben",
//                        "tseg@gmail.com",
//                        LocalDate.of(2000,12,12),
//                        54));

        return studentRepository.findAll();
    }

    public void addStudent(Student student) {
        Optional<Student> studentByEmail = Optional.ofNullable(studentRepository.findStudentByEmail(student.getEmail())
                        .orElse(null));
        if(studentByEmail.isPresent()){
            throw new IllegalStateException();
        }
        studentRepository.save(student);
    }

    public void deleteStudent(Long studentId) {
     Boolean exist = studentRepository.existsById(studentId);
     if(exist)
        studentRepository.deleteById(studentId);
     else
         throw new IllegalStateException();
    }

    @Transactional
    public void updateStudent(Long studentId, String firstName, String lastName) {
    Student student = studentRepository.findById(studentId).orElseThrow(
            () -> new IllegalStateException()
    );
        student.setFirstName(firstName);
        student.setLastName(lastName);
    }
}
