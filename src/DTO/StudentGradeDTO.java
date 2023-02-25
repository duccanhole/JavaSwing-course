/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author datly
 */
public class StudentGradeDTO {

    private int EnrollmentID;
    private int CourseID;
    private int StudentID;
    private double Grade;

    public StudentGradeDTO(int EnrollmentID, int CourseID, int StudentID, double Grade) {
        this.EnrollmentID = EnrollmentID;
        this.CourseID = CourseID;
        this.StudentID = StudentID;
        this.Grade = Grade;
    }

    public StudentGradeDTO() {
    }

    public int getEnrollmentID() {
        return EnrollmentID;
    }

    public void setEnrollmentID(int EnrollmentID) {
        this.EnrollmentID = EnrollmentID;
    }

    public int getCourseID() {
        return CourseID;
    }

    public void setCourseID(int CourseID) {
        this.CourseID = CourseID;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }

    public double getGrade() {
        return Grade;
    }

    public void setGrade(double Grade) {
        this.Grade = Grade;
    }

    @Override
    public String toString() {
        return "StudentGradeDTO{" + "EnrollmentID=" + EnrollmentID + ", CourseID=" + CourseID + ", StudentID=" + StudentID + ", Grade=" + Grade + '}';
    }

}
