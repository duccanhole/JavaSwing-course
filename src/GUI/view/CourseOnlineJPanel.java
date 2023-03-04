/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.view;

import BUS.CourseBUS;
import DTO.CourseDTO;
import DTO.OnlineCourseDTO;
import GUI.ColorTheme;
import java.awt.Color;
import java.awt.Dialog;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Admin
 */
public class CourseOnlineJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CourseOnlineJPanel
     */
    public CourseOnlineJPanel(){
        initComponents();
        setBackground(Color.decode(ColorTheme.neutral));
        listCourse();
        jTfTimkiem.getDocument().addDocumentListener(new DocumentListener(){
            public void changedUpdate(DocumentEvent e){
                Search();
            }

            public void insertUpdate(DocumentEvent e) {
                Search();
            }

            public void removeUpdate(DocumentEvent e) {
                Search();
            }
        });
        
        String[] typesearch = {"CourseID","Title","Credits","Departments","URL"};
        cb = new JComboBox(typesearch);
        cb.setBounds(520, 65, 100, 28);
        add(cb);
    }
    //Fuction for taking list online course to publish on table
    private void listCourse(){
        CourseBUS courseBUS = new CourseBUS();
        try {
            ArrayList<CourseDTO> list = courseBUS.getCourse();
            ArrayList<CourseDTO> result = courseBUS.getOnlineCourse(list);
            DefaultTableModel data = courseBUS.ConvertOnlineCourse(result);
            jTableOnlineC.setModel(data);
        } catch (SQLException e) {
            
        }
    }
    //Checking Number format of Text
    private boolean isNumber(String s){
        try {
            int a = Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnOnlineCourse = new javax.swing.JButton();
        jBtnOnsiteCourse = new javax.swing.JButton();
        jTfTimkiem = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TfTitle = new javax.swing.JTextField();
        TfDepartment = new javax.swing.JTextField();
        TfCredits = new javax.swing.JTextField();
        TfCourseID = new javax.swing.JTextField();
        TfURL = new javax.swing.JTextField();
        jBtnAddC = new javax.swing.JButton();
        jBtnUpdatetC = new javax.swing.JButton();
        jBtnDelC = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableOnlineC = new javax.swing.JTable();
        jBtnReset = new javax.swing.JButton();
        jButtonSearch = new javax.swing.JButton();

        setEnabled(false);
        setPreferredSize(new java.awt.Dimension(750, 600));

        jBtnOnlineCourse.setBackground(new java.awt.Color(86, 237, 243));
        jBtnOnlineCourse.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jBtnOnlineCourse.setText("Online Course");

        jBtnOnsiteCourse.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jBtnOnsiteCourse.setText("Onsite Course");
        jBtnOnsiteCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOnsiteCourseActionPerformed(evt);
            }
        });

        jTfTimkiem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTfTimkiem.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("OnlineCourseID:");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Course Title:");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Department:");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Credits:");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("URL:");
        jLabel5.setToolTipText("");

        TfTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        TfDepartment.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        TfCredits.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        TfCourseID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        TfURL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jBtnAddC.setBackground(new java.awt.Color(86, 237, 243));
        jBtnAddC.setForeground(new java.awt.Color(255, 255, 255));
        jBtnAddC.setText("Add");
        jBtnAddC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnAddCMouseClicked(evt);
            }
        });

        jBtnUpdatetC.setBackground(new java.awt.Color(86, 237, 243));
        jBtnUpdatetC.setForeground(new java.awt.Color(255, 255, 255));
        jBtnUpdatetC.setText("Update");
        jBtnUpdatetC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUpdatetCActionPerformed(evt);
            }
        });

        jBtnDelC.setBackground(new java.awt.Color(86, 237, 243));
        jBtnDelC.setForeground(new java.awt.Color(255, 255, 255));
        jBtnDelC.setText("Delete");
        jBtnDelC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDelCActionPerformed(evt);
            }
        });

        jTableOnlineC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableOnlineC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableOnlineCMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableOnlineC);

        jBtnReset.setBackground(new java.awt.Color(86, 237, 243));
        jBtnReset.setForeground(new java.awt.Color(255, 255, 255));
        jBtnReset.setText("Reset");
        jBtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnResetActionPerformed(evt);
            }
        });

        jButtonSearch.setBackground(new java.awt.Color(59, 138, 196));
        jButtonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/res/search.png"))); // NOI18N
        jButtonSearch.setBorder(null);
        jButtonSearch.setFocusPainted(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnOnlineCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnOnsiteCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTfTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TfCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TfCourseID, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnAddC, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnUpdatetC, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TfURL, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TfDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jBtnDelC, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnOnlineCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnOnsiteCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTfTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(TfDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TfCourseID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(TfURL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TfCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnAddC)
                    .addComponent(jBtnUpdatetC)
                    .addComponent(jBtnDelC)
                    .addComponent(jBtnReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTableOnlineCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableOnlineCMouseClicked
        int index = jTableOnlineC.getSelectedRow();
        TableModel model = jTableOnlineC.getModel();
        
        String CourseID = model.getValueAt(index,1).toString();
        String Title = model.getValueAt(index, 2).toString();
        String Credits = model.getValueAt(index, 3).toString();
        String Department = model.getValueAt(index, 4).toString();
        String url = model.getValueAt(index, 5).toString();
        
        TfCourseID.setText(CourseID);
        TfTitle.setText(Title);
        TfCredits.setText(Credits);
        TfDepartment.setText(Department);
        TfURL.setText(url);
    }//GEN-LAST:event_jTableOnlineCMouseClicked

    private void jBtnAddCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnAddCMouseClicked
        String courseIDgT = TfCourseID.getText().trim();
        String creditgT = TfCredits.getText().trim();
        String departmentgT = TfDepartment.getText().trim();
        String title = TfTitle.getText().trim();
        String url = TfURL.getText().trim();
        
        //Check Blank of TextFiel
        if(courseIDgT.isBlank() || creditgT.isBlank() || departmentgT.isBlank() || title.isBlank() || url.isBlank()){
            JOptionPane.showMessageDialog(this, "All information must be filled!!!");
            return;
        }
        
        //Check Format of CourseID and then get Infor
        if(isNumber(courseIDgT)){
            int cID = Integer.parseInt(courseIDgT);
            
            //Check Format of Credits
            if(isNumber(creditgT)){
                int Credits = Integer.parseInt(creditgT);
                
                //Check Format of Department
                if(isNumber(departmentgT)){
                    int Department = Integer.parseInt(departmentgT);
                    
                    //Tạo 2 đối tượng với cái thông tin đã lấy
                    CourseDTO course = new CourseDTO(cID, title, Credits, Department);
                    OnlineCourseDTO onlinec = new OnlineCourseDTO(cID, url);
                    
                    //Gọi hàm để thêm course vào bảng    
                    String rs = addCourse(course);
                    String rso = addOnCourse(onlinec);
                    
                    if(rs.equalsIgnoreCase("Success") && rso.equalsIgnoreCase("Success")){
                        JOptionPane.showMessageDialog(this, rs+" Add");
                        //Reload bảng
                        listCourse();
                    }
                    else JOptionPane.showMessageDialog(this, "Fail Add");
                }else{
                    JOptionPane.showMessageDialog(this, "Department must be Number !!!");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Credits must be Number !!!");
            }
        }else{
            JOptionPane.showMessageDialog(this, "CourseID must be Number !!!");
        }
    }//GEN-LAST:event_jBtnAddCMouseClicked

    private void jBtnUpdatetCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUpdatetCActionPerformed
        //Checking codition like before Function
        String courseIDgT = TfCourseID.getText().trim();
        String creditgT = TfCredits.getText().trim();
        String departmentgT = TfDepartment.getText().trim();
        String title = TfTitle.getText().trim();
        String url = TfURL.getText().trim();
        
        if(courseIDgT.isBlank() || creditgT.isBlank() || departmentgT.isBlank() || title.isBlank() || url.isBlank()){
            JOptionPane.showMessageDialog(this, "All information must be filled!!!");
            return;
        }
        
        if(isNumber(courseIDgT)){
            int cID = Integer.parseInt(courseIDgT);
            
            //Check Format of Credits
            if(isNumber(creditgT)){
                int credits = Integer.parseInt(creditgT);
                
                //Check Format of Department
                if(isNumber(departmentgT)){
                    int department = Integer.parseInt(departmentgT);
                    
                    //Tạo 2 đối tượng với cái thông tin đã lấy
                    CourseDTO course = new CourseDTO(cID, title, credits, department);
                    OnlineCourseDTO onlinec = new OnlineCourseDTO(cID, url);
                    
                    //Gọi hàm để sửa course
                    int rs = updateCourse(course);
                    int rso = updateOnlCourse(onlinec);
                    if(rs > 0 && rso > 0){
                        JOptionPane.showMessageDialog(this, "Success Update");
                        //Reload bảng
                        listCourse();
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Fail Update");
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(this, "Department must be Number !!!");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Credits must be Number !!!");
            }
        }else{
            JOptionPane.showMessageDialog(this, "CourseID must be Number !!!");
        }
    }//GEN-LAST:event_jBtnUpdatetCActionPerformed

    private void jBtnDelCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDelCActionPerformed
        //Checking codition like before Functions
        String courseIDgT = TfCourseID.getText().trim();
        if(courseIDgT.isBlank()){
            JOptionPane.showMessageDialog(this, "Course ID must be filled!!!");
            return;
        }
        int result = JOptionPane.showConfirmDialog(this, "You really want to delete this course", "Delete", JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.NO_OPTION){
            return;
        }
        if(isNumber(courseIDgT)){
            int cID = Integer.parseInt(courseIDgT);
        
            int rs = delOnlCourse(cID);
            int rso = delCourse(cID);
            
            if(rs > 0 && rso > 0){
                JOptionPane.showMessageDialog(this, "Success Delete");
                //Reload bảng
                listCourse();
            }
            else{
                JOptionPane.showMessageDialog(this, "Fail Delete");
            }
        }else{
            JOptionPane.showMessageDialog(this, "CourseID must be Number !!!");
        }
    }//GEN-LAST:event_jBtnDelCActionPerformed

    private void jBtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnResetActionPerformed
        // TODO add your handling code here:
        TfCourseID.setText("");
        TfCredits.setText("");
        TfTitle.setText("");
        TfDepartment.setText("");
        TfURL.setText("");
        
        listCourse();
    }//GEN-LAST:event_jBtnResetActionPerformed

    private void jBtnOnsiteCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOnsiteCourseActionPerformed
        // TODO add your handling code here:
        CourseManager.COns.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBtnOnsiteCourseActionPerformed
    //Hàm thêm course cho bảng onlinecourse
    private String addCourse(CourseDTO c){
        try{
            CourseBUS cbus = new CourseBUS();
            String rs = cbus.addCourse(c);
            return rs;
        }
        catch(Exception e){
        }
        return "Fail";
    }
    //Hàm thêm course cho bảng onlinecourse
    private String addOnCourse(OnlineCourseDTO c){
        try{
            CourseBUS cbus = new CourseBUS();
            String rs = cbus.addOnlineCourse(c);
            return rs;
        }
        catch(Exception e){
        }
        return "Fail";
    }
    //Các hàm Update Course
    private int updateCourse(CourseDTO c){
        try{
            CourseBUS cbus = new CourseBUS();
            int rs = cbus.UpdateCourse(c);
            return rs;
        }
        catch(Exception e){
        }
        return 0;
    }
    private int updateOnlCourse(OnlineCourseDTO c){
        try{
            CourseBUS cbus = new CourseBUS();
            int rs = cbus.UpdateOnlCourse(c);
            return rs;
        }
        catch(Exception e){
        }
        return 0;
    }
    //Các hàm delete Course
    public int delCourse(int CourseID){
        try {
            CourseBUS cbus = new CourseBUS();
            int rs = cbus.DeleteCourse(CourseID);
            return rs;
        } catch (Exception e) {
        }
        return 0;
    }
    public int delOnlCourse(int CourseID){
        try {
            CourseBUS cbus = new CourseBUS();
            int rs = cbus.DeleteOnlCourse(CourseID);
            return rs;
        } catch (Exception e) {
        }
        return 0;
    }
    //Searching when text JTfTimkiem change
    private void Search(){
        try {
            String timkiem = jTfTimkiem.getText().trim();
            if(timkiem.isBlank()){
                    listCourse();
                    return;
            }
            
            CourseBUS cbus = new CourseBUS();
            ArrayList<CourseDTO> result = new ArrayList<CourseDTO>();
            
            String choose = (String) cb.getSelectedItem();
            result = cbus.SearchOnlineCourse(timkiem,choose);
            
            ListTable(result);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    private void ListTable(ArrayList<CourseDTO> l){
        try {
            CourseBUS cbus = new CourseBUS();
            DefaultTableModel model = cbus.ConvertOnlineCourse(l);
            jTableOnlineC.setModel(model);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private javax.swing.JComboBox cb;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TfCourseID;
    private javax.swing.JTextField TfCredits;
    private javax.swing.JTextField TfDepartment;
    private javax.swing.JTextField TfTitle;
    private javax.swing.JTextField TfURL;
    private javax.swing.JButton jBtnAddC;
    private javax.swing.JButton jBtnDelC;
    private javax.swing.JButton jBtnOnlineCourse;
    private javax.swing.JButton jBtnOnsiteCourse;
    private javax.swing.JButton jBtnReset;
    private javax.swing.JButton jBtnUpdatetC;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableOnlineC;
    private javax.swing.JTextField jTfTimkiem;
    // End of variables declaration//GEN-END:variables
}
