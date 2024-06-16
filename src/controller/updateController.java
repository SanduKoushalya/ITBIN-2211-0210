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
public class updateController {
    public void update(int id,String nameText,String addrssText, int age,int contact ){
       
        new model.updateData().update(id,nameText, addrssText, age,contact);
    }
    
}

