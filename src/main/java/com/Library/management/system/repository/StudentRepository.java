package com.Library.management.system.repository;

import com.Library.management.system.entites.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    public Student findStudentById(int id);
}
