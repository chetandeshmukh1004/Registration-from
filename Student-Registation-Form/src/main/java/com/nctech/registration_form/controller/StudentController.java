package com.nctech.registration_form.controller;

import com.nctech.registration_form.dto.Student;
import com.nctech.registration_form.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student/")
public class StudentController {
    @Autowired

    private StudentService studentService;
   @PostMapping("save")
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }
    @PutMapping("update")
    public Student update(@RequestBody Student student){
        return studentService.update(student);
    }
    @GetMapping("find/{id}")
    public Student findById(@PathVariable("id") int id){
        return studentService.findById(id);
    }
    @GetMapping("find")
    public List<Student> findAll(){
        return studentService.findAll();
    }
    @DeleteMapping( "delete/{id}")
    public void delete(@PathVariable("id") int id){
        studentService.delete(id);
    }
}
