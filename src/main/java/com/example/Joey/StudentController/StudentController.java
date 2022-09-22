package com.example.Joey.StudentController;

import com.example.Joey.Services.StudentService;
import com.example.Joey.attempt.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> sayHi(){
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Optional<Student> showId(@PathVariable Long id){
        return studentService.getStudent(id);
    }

    @PostMapping(value = "/students")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @PatchMapping(value = "/students/{id}")
    public void updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
    }

    @DeleteMapping(value = "/students/{id}")
    public void deleteStudent(@PathVariable Long id){
            studentService.deleteStudent(id);
    }
}
