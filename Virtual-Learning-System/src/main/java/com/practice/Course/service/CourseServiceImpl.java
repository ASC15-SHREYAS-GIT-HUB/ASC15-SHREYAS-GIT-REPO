package com.practice.Course.service;

import com.practice.Course.entity.CourseEntity;
import com.practice.Course.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CourseServiceImpl implements  CourseService {
    private final CourseRepository courseRepository;

    @Autowired
    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<CourseEntity> getAllCourses() {
        System.err.println("Getting All Employees!");
        return courseRepository.findAll();
    }

    @Override
    public CourseEntity saveCor(CourseEntity cor) {
        return courseRepository.save(cor);

    }

    @Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public CourseEntity searchCourseByName(String courseName) {
        return courseRepository.findByCourseName(courseName);
    }



}