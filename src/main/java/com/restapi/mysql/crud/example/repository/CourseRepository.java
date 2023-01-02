package com.restapi.mysql.crud.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.mysql.crud.example.entity.Course;


public interface CourseRepository extends JpaRepository<Course,String> {
    Course findByCourseName(String courseName);
}

