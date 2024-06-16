
 
package controller;



public class studentController {
    public void stdu(int id,String nme,String addrss,int Grade, String addte, int Age, String gndr, String bthdy, int Contact){
        new model.newStudent().addProduct(id,nme,addrss,Grade,addte,Age, gndr,bthdy,Contact);
    }
}

