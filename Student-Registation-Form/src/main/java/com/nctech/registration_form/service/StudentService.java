package com.nctech.registration_form.service;

import com.nctech.registration_form.dto.Student;

import java.util.List;

public interface StudentService {
    public Student save(Student student);
    public Student update(Student student);
    public Student findById(int id);
    public List<Student> findAll();
    public void delete(int id);
}
