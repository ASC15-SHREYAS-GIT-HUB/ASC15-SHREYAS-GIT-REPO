package com.practice.Course.controller;

import com.practice.Course.entity.CourseEntity;
import com.practice.Course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cart")
public class CourseController {
    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService){
        this.courseService = courseService;
    }

    @GetMapping("/courses")
    public List<CourseEntity> getAllCourses(){
        return courseService.getAllCourses();
    }

    @PostMapping
    public CourseEntity createCor(@RequestBody CourseEntity cor) {
        return courseService.saveCor(cor);
    }

    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
    }

    @GetMapping("/search")
    public CourseEntity searchCourse(@RequestParam String courseName) {
        return courseService.searchCourseByName(courseName);
    }



}
