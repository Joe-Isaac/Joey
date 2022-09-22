package com.example.Joey.Services;

import com.example.Joey.Repository.StudentRepo;
import com.example.Joey.attempt.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public List<Student> getAllStudents(){
        List <Student> students = new ArrayList<>();
        studentRepo.findAll().
                forEach(students::add);
        return students;
    }

    public Optional<Student> getStudent(Long id){
        return studentRepo.findById(id);
    }

    public void addStudent(Student student){
        studentRepo.save(student);
    }

    public void updateStudent(Student student) {
        studentRepo.save(student);
    }

    public void deleteStudent(Long id){
        studentRepo.deleteById(id);
    }
}
