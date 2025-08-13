package com.practice.Course.service;

import com.practice.Course.entity.CourseEntity;

import java.util.List;

public interface CourseService {

    List<CourseEntity> getAllCourses();

    public CourseEntity saveCor(CourseEntity cor);

    void deleteCourse(Long id);

    CourseEntity searchCourseByName(String courseName);


}
