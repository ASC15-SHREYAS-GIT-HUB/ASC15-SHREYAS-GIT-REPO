package com.practice.Course.repository;

import com.practice.Course.entity.CourseEntity;
import com.practice.login.entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository  extends JpaRepository<CourseEntity, Long> {

        CourseEntity findByCourseName(String courseName);

}

