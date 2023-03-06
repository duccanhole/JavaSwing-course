/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import BUS.personBUS;
import DTO.personDTO;
import java.beans.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author PC
 */
public class personDAO {
    MyConnectUnit connect;
    
    public ArrayList<personDTO> docDB(String condition, String orderBy) throws Exception {
        // kết nối CSDL
        connect = new MyConnectUnit();
        
        ResultSet result = this.connect.Select("person", condition, orderBy);
        ArrayList<personDTO> persons = new ArrayList<>();
        while ( result.next() ) {
            personDTO person = new personDTO();
            person.setPersonID(result.getInt("PersonID"));
            person.setLastname(result.getString("Lastname"));
            person.setFirstname(result.getString("Firstname"));
            person.setHireDate(result.getDate("HireDate"));
            person.setEnrollmentDate(result.getDate("EnrollmentDate"));
            
            persons.add(person);
        }
        connect.Close();
        return persons;
    }
   
     public ArrayList<personDTO> docDB(String condition) throws Exception {
        return docDB(condition, null);
    }
    
    public ArrayList<personDTO> docDB() throws Exception {
        return docDB(null);
    }
    public Boolean them(personDTO person) throws Exception {
        connect = new MyConnectUnit();
        
        // tạo đối tượng truyền vào
        HashMap<String, Object> insertValues = new HashMap<>();
        insertValues.put("PersonID", person.getPersonID());
        insertValues.put("Lastname", person.getLastname());
        insertValues.put("Firstname", person.getFirstname());
        insertValues.put("HireDate", person.getHireDate());
        insertValues.put("EnrollmentDate", person.getEnrollmentDate());

       
        Boolean check = connect.Insert("person", insertValues);

        connect.Close();
        return check;
    }
      public Boolean xoa(personDTO person) throws Exception {
        connect = new MyConnectUnit();
        String condition = " PersonID = '"+person.getPersonID()+"'";
        
        Boolean check = connect.Delete("person", condition);
        
        connect.Close();
        return check;
    }
    
   
    public Boolean sua(personDTO person) throws Exception {
        connect = new MyConnectUnit();
        
        // tạo đối tượng truyền vào
        HashMap<String, Object> insertValues = new HashMap<>();
         insertValues.put("PersonID", person.getPersonID());
        insertValues.put("Lastname", person.getLastname());
        insertValues.put("Firstname", person.getFirstname());
        insertValues.put("HireDate", person.getHireDate());
        insertValues.put("EnrollmentDate", person.getEnrollmentDate());
        
        System.out.println(person.toString());
        
        String condition = " PersonID = '"+person.getPersonID()+"'";
        
        Boolean check = connect.Update("person", insertValues, condition);
        
        connect.Close();
        return check;
    }
}
