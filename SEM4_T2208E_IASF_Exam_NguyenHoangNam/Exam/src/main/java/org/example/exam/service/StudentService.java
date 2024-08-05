package org.example.exam.service;


import org.example.exam.dto.StudentDto;
import org.example.exam.entity.Student;
import org.example.exam.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentDto saveStudent(StudentDto studentDTO) {
        Student student = new Student();
        student.setName(studentDTO.getName());
        student.setAddress(studentDTO.getAddress());
        student = studentRepository.save(student);
        studentDTO.setStudentID(student.getStudentID());
        return studentDTO;
    }


}
