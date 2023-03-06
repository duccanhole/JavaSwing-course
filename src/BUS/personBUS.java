/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.personDAO;
import DTO.personDTO;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class personBUS {
    private ArrayList<personDTO> list_person;
    
    private personDAO persondao;
    
    public personBUS() throws Exception{
        list_person = new ArrayList<>();
        persondao=new personDAO();
        list_person=persondao.docDB();
    }
     public void docDB() throws Exception {
        list_person = new ArrayList<>();
        persondao = new personDAO();
        list_person = persondao.docDB();
    }
    public ArrayList<personDTO> getList_person(){
        return list_person;
    }
    public void setList_person(ArrayList<personDTO> list_person){
        this.list_person=list_person;
    }
     public int getSize() {
        return list_person.size();
    }
    public int getDefaultPersonID() {
       return list_person.size()+1;
    }
    public boolean Addperson(personDTO p) throws Exception{
        list_person.add(p);
        return persondao.them(p);
    }
   public Boolean xoa(personDTO p) throws Exception {
        if ( persondao.xoa(p) ) {
            
            // duyệt từng phẩn tử
            for ( personDTO person : list_person ) {
                if (person.getPersonID()==p.getPersonID()){
                    list_person.remove(person);
                    return true;
                }
            }
        }
        
        return false;
    }
    
    /**
     * sửa thông tin của 1sản phẩm <br>
     * - Trừ thông tin đăng nhập củasản phẩm đó
     * @return true nếu thực hiện thành công
     */
    public Boolean sua(personDTO p) throws Exception {
        if ( persondao.sua(p) ) {
            
            // duyệt từng phẩn tử
            for ( personDTO person : list_person ) {
                if (person.getPersonID()==p.getPersonID()){
                    person.setPersonID(p.getPersonID());
                    person.setFirstname(p.getFirstname());
                    person.setLastname(p.getLastname());
                    person.setHireDate(p.getHireDate());
                    person.setEnrollmentDate(p.getEnrollmentDate());
                    
                    return true;
                }
            }
        }
        return false;
    }
     public ArrayList<personDTO> timKiem_LastName(String Lastname) {
         
        ArrayList<personDTO> arr = new ArrayList<>();
        for (personDTO person : list_person) {
            if ( person.getLastname().equals(Lastname) ) {
                arr.add(person);
            }
        }
        return arr;
    }
}
