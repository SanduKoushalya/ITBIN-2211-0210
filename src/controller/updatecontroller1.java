/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package controller;


public class updatecontroller1 {
  public void update(int id,String nameText,String addrssText, int age,int contact ){
       
        new model.updateData().update(id,nameText, addrssText, age,contact);
    }
      
}*/

package controller;

import model.updateData1;

public class updatecontroller1 {
    public void update(int id, String nameText, String addressText, int age, int contact) {
        new updateData1().update(id, nameText, addressText, age, contact);
    }
}

