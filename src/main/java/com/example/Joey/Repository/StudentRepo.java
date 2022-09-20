package com.example.Joey.Repository;

import com.example.Joey.attempt.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, Long> {
}
