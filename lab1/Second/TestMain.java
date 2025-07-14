package com.demo.labs.lab1.Second;

 class Student {
    // Attributes
    private int studentId;
    private String studentName;
    private String city;
    private int marks1, marks2, marks3;
    private float feePerMonth;
    private boolean isEligibleForScholarship;

    // Getters and Setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getMarks1() {
        return marks1;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }

    public float getFeePerMonth() {
        return feePerMonth;
    }

    public void setFeePerMonth(float feePerMonth) {
        this.feePerMonth = feePerMonth;
    }

    public boolean isEligibleForScholarship() {
        return isEligibleForScholarship;
    }

    public void setEligibleForScholarship(boolean isEligibleForScholarship) {
        this.isEligibleForScholarship = isEligibleForScholarship;
    }

    // Business Logic Methods
    public float getAnnualFee() {
        return feePerMonth * 12;
    }

    public int getTotalMarks() {
        return marks1 + marks2 + marks3;
    }

    public float getAverage() {
        return getTotalMarks() / 3.0f;
    }

    public String getResult() {
        if (marks1 > 60 && marks2 > 60 && marks3 > 60) {
            return "pass";
        } else {
            return "fail";
        }
    }
}

public class TestMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudentId(101);
        s1.setStudentName("Alice");
        s1.setCity("New York");
        s1.setMarks1(85);
        s1.setMarks2(90);
        s1.setMarks3(88);
        s1.setFeePerMonth(500.0f);
        s1.setEligibleForScholarship(true);

        Student s2 = new Student();
        s2.setStudentId(102);
        s2.setStudentName("Bob");
        s2.setCity("Los Angeles");
        s2.setMarks1(75);
        s2.setMarks2(80);
        s2.setMarks3(78);
        s2.setFeePerMonth(450.0f);
        s2.setEligibleForScholarship(false);

        Student s3 = new Student();
        s3.setStudentId(103);
        s3.setStudentName("Charlie");
        s3.setCity("Chicago");
        s3.setMarks1(65);
        s3.setMarks2(70);
        s3.setMarks3(60); // Not all marks > 60
        s3.setFeePerMonth(400.0f); // Lowest fee
        s3.setEligibleForScholarship(true);

        // Array to hold students
        Student[] students = {s1, s2, s3};

        // Find student with highest total marks
        Student topStudent = students[0];
        for (Student s : students) {
            if (s.getTotalMarks() > topStudent.getTotalMarks()) {
                topStudent = s;
            }
        }
        System.out.println("Student with highest total marks: " + topStudent.getStudentName());

        // Find student with lowest monthly fee
        Student cheapestStudent = students[0];
        for (Student s : students) {
            if (s.getFeePerMonth() < cheapestStudent.getFeePerMonth()) {
                cheapestStudent = s;
            }
        }
        System.out.println("Student with least monthly fee: " + cheapestStudent.getStudentName() + " (Fee: $" + cheapestStudent.getFeePerMonth() + ")");

        // Print details of all students
        System.out.println("\nStudent Details:");
        for (Student s : students) {
            System.out.println("Name: " + s.getStudentName());
            System.out.println("Total Marks: " + s.getTotalMarks());
            System.out.println("Average Marks: " + s.getAverage());
            System.out.println("Result: " + s.getResult());
            System.out.println("Scholarship Eligible: " + s.isEligibleForScholarship());
            System.out.println("--------------------------");
        }
    }
}

