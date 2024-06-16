/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.DBconnector;

public class AddModel {
    
    public void addDetails(int id, String Name, String Address, String Subject, String AddmissionDate, int ag, String Gender, String Birthday, int cntct) {
        String sql = "INSERT INTO teacher(TeacherId, Name, Address, Subject, `Admission Date`, Age, Gender, Birthday, Contact) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection con = DBconnector.conn();
             PreparedStatement pst = con.prepareStatement(sql)) {
             
            pst.setInt(1, id);
            pst.setString(2, Name);
            pst.setString(3, Address);
            pst.setString(4, Subject);
            pst.setString(5, AddmissionDate);
            pst.setInt(6, ag);
            pst.setString(7, Gender);
            pst.setString(8, Birthday);
            pst.setInt(9, cntct);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "DATA INSERT SUCCESSFULLY");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}



