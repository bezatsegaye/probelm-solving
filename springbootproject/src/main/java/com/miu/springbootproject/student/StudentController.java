package com.miu.springbootproject.student;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping(path = "{studentId}")
    public Student getStudentById(@PathVariable Long studentId) {
        return studentService.getStudentById(studentId);
    }

    @PostMapping
    public void addStudent(@RequestBody Student student) {studentService.update(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable Long studentId) {
        studentService.deleteStudent(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudentWithStudnetAttribute(@PathVariable Long studentId,
                                                  @RequestParam (required = false) String firstName,
                                                  @RequestParam (required = false) String lastName) {
        studentService.updateStudentWithStudnetAttribute(studentId, firstName, lastName);
    }

    @PutMapping
    public void updateStudent(@RequestBody Student student) {
        studentService.update(student);
    }
}
