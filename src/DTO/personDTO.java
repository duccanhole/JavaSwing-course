/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author PC
 */
public class personDTO {
    private int PersonID;
    private String Lastname,Firstname;
    private Date HireDate,EnrollmentDate;

    public personDTO() {
       
    }
    public personDTO(int PersonID ,String Lastname,String Firstname,Date HireDate,Date EnrollmentDate){
        this.PersonID=PersonID;
        this.Lastname=Lastname;
        this.Firstname=Firstname;
        this.HireDate=HireDate;
        this.EnrollmentDate=EnrollmentDate;
    }
    public void setPersonID(int PersonID){
        this.PersonID=PersonID;
    }
    public void setLastname(String Lastname){
        this.Lastname=Lastname;
    }
    public void setFirstname(String Firstname){
        this.Firstname=Firstname;
    }
    public void setHireDate(Date HireDate){
       this.HireDate=HireDate;
    }
    public void setEnrollmentDate(Date EnrollmentDate){
        this.EnrollmentDate=EnrollmentDate;
    }
    
    public int getPersonID(){
        return PersonID;
    }
    public String getLastname(){
        return Lastname;
    }
    public String getFirstname(){
        return Firstname;
    }
    public Date getHireDate(){
        return HireDate;
    }
    public Date getEnrollmentDate(){
        return EnrollmentDate;
    }
   
}
