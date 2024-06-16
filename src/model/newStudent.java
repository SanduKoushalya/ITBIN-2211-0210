/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class newStudent {
    Connection con = null;
    PreparedStatement pst = null;
    
    
    
    
 public void addProduct(int id,String nme,String addrss,int Grade, String addte, int Age, String gndr, String bthdy, int Contact){
    con = DBconnector.conn();
    PreparedStatement pst = null;
    try {
        String sqlquery = "INSERT INTO student(StudentId, Name, Address, Grade, AdmissionDate, Age, Gender, Birthday, Contact) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        pst = con.prepareStatement(sqlquery);
        pst.setInt(1, id);
        pst.setString(2, nme);
        pst.setString(3, addrss);
        pst.setInt(4, Grade);
        pst.setString(5, addte);  // Ensure the date format is correct
        pst.setInt(6, Age);
        pst.setString(7, gndr);
        pst.setString(8, bthdy);  // Ensure the date format is correct
        pst.setInt(9, Contact);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Data Inserted SUCCESSFULLY");
    } catch (HeadlessException | SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    } finally {
        if (pst != null) {
            try {
                pst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

    
    
 
}
