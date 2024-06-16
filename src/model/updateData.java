/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class updateData {
    
    
    
    Connection con = null;
    PreparedStatement pst = null;
    
    public void update(int id,String nameText,String addrssText, int age,int contact) {
    con = DBconnector.conn();
    
    try {
          String sqlquery = "UPDATE teacher SET Name = ?, Address = ?, Age = ?, Contact = ? WHERE TeacherId = ?";

        pst = con.prepareStatement(sqlquery);
        pst.setString(1, nameText);
        pst.setString(2, addrssText);
        pst.setInt(3, age);
        pst.setInt(4, contact);
        pst.setInt(5, id);
        
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "UPDATE SUCCESSFUL");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    } finally {
        try {
            if (pst != null) pst.close();
            if (con != null) con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
    
    
    
    
  
}
