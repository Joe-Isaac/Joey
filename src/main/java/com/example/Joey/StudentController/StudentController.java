package com.example.Joey.StudentController;

import com.example.Joey.Services.StudentService;
import com.example.Joey.attempt.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/student")
    public List<Student> sayHi(){
        return studentService.getStudents();
    }

    @GetMapping("/student/{id}")
    public String showId(@PathVariable Long id){
        return studentService.getStudent(id);
    }

    @PostMapping(value = "/students")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }
}
