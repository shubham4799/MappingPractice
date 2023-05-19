package com.geekster.Mapping.Practice.repositories;

import com.geekster.Mapping.Practice.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends JpaRepository<Student , Integer> {
    @Modifying
    @Query(value = "update student set student_Name = :studentName , student_Age = :studentAge , student_Phone_Number = :studentPhoneNumber , student_Branch = :studentBranch , student_Department = :studentDepartment where student_Id = :studentId" , nativeQuery = true)
    void updateStudent(Integer studentId, String studentName, String studentAge, String studentPhoneNumber, String studentBranch, String studentDepartment);
}
