
package controller;

import model.AddModel;

public class AddControl {
    
    public void studentDetails(int id, String Name, String Address, String Subject, String AddmissionDate, int ag, String Gender, String Birthday, int cntct) {
        new AddModel().addDetails(id, Name, Address, Subject, AddmissionDate, ag, Gender, Birthday, cntct);
    }
}
