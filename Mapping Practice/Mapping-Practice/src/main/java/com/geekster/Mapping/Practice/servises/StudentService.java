package com.geekster.Mapping.Practice.servises;

import com.geekster.Mapping.Practice.models.Address;
import com.geekster.Mapping.Practice.models.Student;
import com.geekster.Mapping.Practice.repositories.IAddressRepo;
import com.geekster.Mapping.Practice.repositories.IStudentRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private IStudentRepo iStudentRepo;
    @Autowired
    private IAddressRepo addressRepo;

    public String addStudent(Student student) {
     Integer addressId = student.getAddress().getAddressId();
        Address addressObj = addressRepo.findById(addressId).get();
        student.setAddress(addressObj);
        iStudentRepo.save(student);

        return "Student saved Successfully!!";
    }

    public List<Student> getAllStudent() {
        return iStudentRepo.findAll();
    }
     @Transactional
    public String updateStudent(Student student) {
        iStudentRepo.updateStudent(student.getStudentId(),student.getStudentName(),student.getStudentAge(),student.getStudentPhoneNumber(),student.getStudentBranch(),student.getStudentDepartment());
        return "Student updated Successfully";
    }

    public String deleteStudent(Integer studentId) {
        iStudentRepo.deleteById(studentId);
        return "Id "+studentId+" Student deleted Successfully!!";
    }
}
