package com.Library.management.system.service;
import com.Library.management.system.entites.Card;
import com.Library.management.system.entites.Student;
import com.Library.management.system.enums.CardStatus;
import com.Library.management.system.enums.Genre;
import com.Library.management.system.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public String addStudent(Student student) {

        Card card = new Card();

        card.setCardStatus(CardStatus.ACTIVATED);
        card.setValidTil("5-6-2029");
        card.setStudent(student);

        student.setCard(card);
        studentRepository.save(student);
        return "student add successfully";
    }

    public String deleteStudentById(int id) {
        try {
            Student student = studentRepository.findStudentById(id);
            studentRepository.delete(student);
        }catch (Exception e){
            return "id is Not Exist";
        }
        return "Student delete Successfully";
    }

    public String updateStudent(Student student, int id) {

            student.setId(id);
            studentRepository.save(student);

        return "student update successfully";
    }

    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }

    public Student getStudentById(int id){
        return studentRepository.findStudentById(id);
    }

}
