package com.Library.management.system.service;

import com.Library.management.system.entites.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    String addStudent(Student student);
    String deleteStudentById(int id);
    String updateStudent(Student student, int id);
    List<Student> getAllStudent();
    Student getStudentById(int id);


}
