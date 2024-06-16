/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author USER
 */
public class deleteControl1 {
    public void delete(int id){
        
        new model.deleteStudent().delete(id);
        
    }
    
}
