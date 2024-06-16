/*
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class updateData1 {
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
        
    }}}*/

package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class updateData1 {
    private Connection con = null;
    private PreparedStatement pst = null;

    public void update(int id, String nameText, String addressText, int age, int contact) {
        con = DBconnector.conn();
        try {
            String sqlQuery = "UPDATE student SET Name = ?, Address = ?, Age = ?, Contact = ? WHERE StudentId = ?";
            pst = con.prepareStatement(sqlQuery);
            pst.setString(1, nameText);
            pst.setString(2, addressText);
            pst.setInt(3, age);
            pst.setInt(4, contact);
            pst.setInt(5, id);

            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Update successful");
            } else {
                JOptionPane.showMessageDialog(null, "Update failed. No such teacher found.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } finally {
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error closing resources: " + e.getMessage());
            }
        }
    }
}
