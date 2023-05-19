package com.geekster.Mapping.Practice.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer courseId;
    private String courseTitle;
    private String courseDescription;
    private String courseDuration;

    @ManyToMany
    @JoinColumn(name = "foreign_key")
   private List<Student> studentList;
}
