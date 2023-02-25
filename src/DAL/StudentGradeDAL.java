/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.PersonDTO;
import DTO.StudentGradeDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author datly
 */
public class StudentGradeDAL extends MyDatabaseManager {

    public StudentGradeDAL() {
        super();
        this.connectDB();
    }

    public ArrayList<StudentGradeDTO> getStudentGrade() throws SQLException {
        ArrayList<StudentGradeDTO> listStudentGrade = new ArrayList<StudentGradeDTO>();
        try {
            String query = "select * from studentgrade";
            ResultSet rs = this.doReadQuery(query);
            while (rs != null) {
                StudentGradeDTO student = new StudentGradeDTO(rs.getInt("EnrollmentID"), rs.getInt("CourseID"), rs.getInt("StudentID"), rs.getDouble("Grade"));
                listStudentGrade.add(student);
            }
        } catch (SQLException e) {
        }
        return listStudentGrade;
    }

    public ArrayList<PersonDTO> getPerson() {
        ArrayList<PersonDTO> listPerson = new ArrayList<PersonDTO>();

        String query = "select * from person";

        ResultSet rs = this.doReadQuery(query);

        return listPerson;
    }

}
