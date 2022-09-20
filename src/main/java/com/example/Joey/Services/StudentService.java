package com.example.Joey.Services;

import com.example.Joey.Repository.StudentRepo;
import com.example.Joey.attempt.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public List<Student> getStudents(){
        List <Student> students = new ArrayList<>();
        return studentRepo.findAll().forEach(students::add);
    }

    public String getStudent(Long id){
        studentRepo.findById(id);
    }

    public void addStudent(Student student){
        Student student1 = new Student(4L, "Krazy Ken", "Medicine");
    }

}
