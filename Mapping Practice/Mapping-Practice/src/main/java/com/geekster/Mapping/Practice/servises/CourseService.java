package com.geekster.Mapping.Practice.servises;

import com.geekster.Mapping.Practice.models.Address;
import com.geekster.Mapping.Practice.models.Course;
import com.geekster.Mapping.Practice.models.Student;
import com.geekster.Mapping.Practice.repositories.IAddressRepo;
import com.geekster.Mapping.Practice.repositories.ICourseRepo;
import com.geekster.Mapping.Practice.repositories.IStudentRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    private ICourseRepo iCourseRepo;
    @Autowired
    private IStudentRepo studentRepo;

    public String addCourse(Course course) {
        List<Student> studentList = course.getStudentList();
       ArrayList<Student> temp = new ArrayList<>();
        for(Student studentObj : studentList){


           Integer stId = studentObj.getStudentId();

           Student studentObject = studentRepo.findById(stId).get();  // address Object
           temp.add(studentObject);
        }
        course.setStudentList(temp);
        iCourseRepo.save(course);

        return "Course added Successfully!!";
    }

    public List<Course> getAllCourse() {
        return iCourseRepo.findAll();
    }
    @Transactional
    public String updateByIdCourse(Course course) {
        iCourseRepo.updateByIdCourse(course.getCourseId(),course.getCourseTitle(),course.getCourseDescription(),course.getCourseDuration());
        return "Course Updated Successfully!!";
    }

    public String deleteCourseById(Integer courseId) {
        iCourseRepo.deleteById(courseId);
        return "Id "+courseId+" Course Deleted successfully!!";
    }
}
