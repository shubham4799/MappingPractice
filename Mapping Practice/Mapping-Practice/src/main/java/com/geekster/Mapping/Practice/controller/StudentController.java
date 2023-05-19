package com.geekster.Mapping.Practice.controller;

import com.geekster.Mapping.Practice.models.Student;
import com.geekster.Mapping.Practice.servises.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("addStudent")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @GetMapping("getAllStudent")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }
    @PutMapping("updateStudent")
    public String updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("deleteStudent/{studentId}")
    public String deleteStudent(@PathVariable Integer studentId){
        return studentService.deleteStudent(studentId);
    }
}
