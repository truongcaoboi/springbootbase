package com.tcb.test.controller;

import com.tcb.test.model.StudentEntity;
import com.tcb.test.model.SubjectEntity;
import com.tcb.test.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("")
    public StudentEntity create(@Valid @RequestBody StudentEntity studentEntity){
        return studentService.create(studentEntity);
    }

    @GetMapping("/{id}")
    public StudentEntity getById(@PathVariable Long id){
        return studentService.getById(id);
    }
}
