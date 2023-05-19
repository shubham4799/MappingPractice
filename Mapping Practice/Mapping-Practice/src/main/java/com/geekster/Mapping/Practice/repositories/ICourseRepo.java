package com.geekster.Mapping.Practice.repositories;

import com.geekster.Mapping.Practice.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepo extends JpaRepository<Course ,Integer> {
    @Modifying
    @Query(value = "update course set course_Title = :courseTitle , course_Description = :courseDescription , course_Duration = :courseDuration where course_Id = :courseId" , nativeQuery = true)
    void updateByIdCourse(Integer courseId, String courseTitle, String courseDescription, String courseDuration);
}
