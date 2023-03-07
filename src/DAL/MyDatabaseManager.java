/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author haidu
 */
public class MyDatabaseManager {
    public PreparedStatement p;
    public Connection conn;
    public Statement stmt;
    Connection connect = null;
    Statement statement = null;
    ResultSet resultSet = null;
    private static final String DB_URL = "jdbc:mysql://localhost:3306/school";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "";

    public void connectDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            stmt = conn.createStatement();
            System.out.println("connected!!!!!!!!!!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyDatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet doReadQuery(String sql) {
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(MyDatabaseManager.class.getName()).log(Level.SEVERE, null, e);
        }
        return rs;
    }
     public int executeUpdate(String Query) throws Exception {
        //khai báo biến int để lưu trữ kết quả torng quá trình thực thi
        int res = Integer.MIN_VALUE;
        
        try {
            //thực thi câu lệnh
            res = stmt.executeUpdate(Query);
        } catch (Exception e) {
            throw new Exception("Error " + e.getMessage());
        }
        
        return res;
    }
      public void Close() throws Exception {
        if (this.resultSet != null && this.resultSet.isClosed()) {
            this.resultSet.close();
            this.resultSet = null;
        }
        if (this.statement != null && this.statement.isClosed()) {
            this.statement.close();
            this.statement = null;
        }
        if (this.connect != null && this.connect.isClosed()) {
            this.connect.close();
            this.connect = null;
        }
    }
}
