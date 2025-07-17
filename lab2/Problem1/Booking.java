package com.demo.labs.lab2.Problem1;

public class Booking {
    private String employeeId;
    private String meetingRoomId;
    private String meetingDate;
    private String meetingTime;
    private String duration;

    // Constructor
    public Booking(String employeeId, String meetingRoomId, String meetingDate, String meetingTime, String duration) {
        if (employeeId == null || meetingRoomId == null || meetingDate == null || meetingTime == null || duration == null) {
            throw new IllegalArgumentException("All fields must be non-null");
        }
        this.employeeId = employeeId;
        this.meetingRoomId = meetingRoomId;
        this.meetingDate = meetingDate;
        this.meetingTime = meetingTime;
        this.duration = duration;
    }

    // Getters
    public String getEmployeeId() {
        return employeeId;
    }

    public String getMeetingRoomId() {
        return meetingRoomId;
    }

    public String getMeetingDate() {
        return meetingDate;
    }

    public String getMeetingTime() {
        return meetingTime;
    }

    public String getDuration() {
        return duration;
    }

    // Setters
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setMeetingRoomId(String meetingRoomId) {
        this.meetingRoomId = meetingRoomId;
    }

    public void setMeetingDate(String meetingDate) {
        this.meetingDate = meetingDate;
    }

    public void setMeetingTime(String meetingTime) {
        this.meetingTime = meetingTime;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    // Updated toString to include MeetingRoom details (called from App)
    @Override
    public String toString() {
        return "Booking for Employee ID: " + employeeId +
                ", Meeting Room ID: " + meetingRoomId +
                ", Date: " + meetingDate +
                ", Time: " + meetingTime +
                ", Duration: " + duration;
    }
}