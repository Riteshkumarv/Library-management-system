package com.Library.management.system.controller;

import com.Library.management.system.entites.Student;
import com.Library.management.system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
         return studentService.addStudent(student);
    }

    @DeleteMapping("/deleteStudentById/{id}")
    public String deleteStudentById(@PathVariable("id") int id){
         return studentService.deleteStudentById(id);
    }

    @PutMapping("/updateStudent/{id}")
    public String updateStudent(@RequestBody Student student,@PathVariable int id){
        return studentService.updateStudent(student,id);
    }

    @GetMapping("/getAllStudent")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @GetMapping("/getStudentById/{id}")
    public Student getStudentById(@PathVariable("id")int id){
        return studentService.getStudentById(id);
    }

}
