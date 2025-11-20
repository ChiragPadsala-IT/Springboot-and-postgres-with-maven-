package com.example.demo.service;

import com.example.demo.dto.StudentDto;

import java.util.List;

public interface StudentService {

    List<StudentDto> getAllStudent();

    StudentDto getStudentById(Long id);
}
