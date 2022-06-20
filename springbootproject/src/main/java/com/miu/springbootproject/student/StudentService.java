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

    public Student getStudentById(Long id) {
        return this.studentRepository.findById(id).orElse(null);
    }

    public void update(Student student) {
        if (student.getId() != null) {
            Optional<Student> studentById = Optional.ofNullable(studentRepository.findById(student.getId())
                    .orElse(null));
            if (studentById.isPresent()) {
                studentRepository.deleteById(student.getId());
                studentRepository.save(student);
            } else {
                throw new IllegalStateException();
            }
        } else {
            studentRepository.save(student);
        }
    }

    public void deleteStudent(Long studentId) {
        Boolean exist = studentRepository.existsById(studentId);
        if(exist)
            studentRepository.deleteById(studentId);
        else
            throw new IllegalStateException();
    }

    @Transactional
    public void updateStudentWithStudnetAttribute(Long studentId, String firstName, String lastName) {
        Student student = studentRepository.findById(studentId).orElseThrow(
                () -> new IllegalStateException()
        );
        student.setFirstName(firstName);
        student.setLastName(lastName);
    }
}