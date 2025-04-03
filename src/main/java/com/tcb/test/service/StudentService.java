package com.tcb.test.service;

import com.tcb.test.model.StudentEntity;
import com.tcb.test.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public StudentEntity create(StudentEntity studentEntity){
        return studentRepository.save(studentEntity);
    }

    public StudentEntity getById(Long id){
        return studentRepository.findById(id).orElse(null);
    }
}
