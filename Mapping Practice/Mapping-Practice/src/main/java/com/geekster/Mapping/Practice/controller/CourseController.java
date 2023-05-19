package com.geekster.Mapping.Practice.controller;

import com.geekster.Mapping.Practice.models.Course;
import com.geekster.Mapping.Practice.servises.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping("/addCourse")
    public String addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }
    @GetMapping("/getAllCourse")
    public List<Course> getAllCourse(){
        return courseService.getAllCourse();
    }
    @PutMapping("/updateByIdCourse")
    public String updateByIdCourse(@RequestBody Course course){
        return courseService.updateByIdCourse(course);
    }
    @DeleteMapping("/deleteCourseById/{courseId}")
    public String deleteCourseById(@PathVariable Integer courseId){
        return courseService.deleteCourseById(courseId);
    }
}
