package com.practice.Course.entity;

import javax.persistence.*;

@Entity
@Table(name = "COURSE")
public class CourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "CourseId", nullable = false)
    private String courseId;
    @Column(name="CourseName",nullable=false)
    private String courseName;
    @Column(name="AuthorName",nullable=false)
    private String authorName;
    @Column(name="Duration",nullable = false)
    private int duration;
    @Column(name="Availability",nullable = false)
    private String availability;

    public CourseEntity(){

    }

    public CourseEntity(Long id,String courseId,String courseName,String authorName,int duration,String availability){
        this.id=id;
        this.courseId=courseId;
        this.courseName=courseName;
        this.authorName=authorName;
        this.duration=duration;
        this.availability=availability;
    }

    public Long getid(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }

    public String getcourseId(){
        return courseId;
    }
    public void setCourseId(String courseId){
        this.courseId= courseId;
    }

    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String courseName){
        this.courseName=courseName;
    }

    public String getAuthorNameName(){
        return authorName;
    }
    public void setAuthorName(String authorName){
        this.authorName=authorName;
    }

    public int getDuration(){
        return duration;
    }
    public void setDuration(int duration){
        this.duration=duration;
    }

    public String getAvailability(){
        return availability;
    }
    public void setAvailability(String availability){
        this.availability=availability;
    }



}
