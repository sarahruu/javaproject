/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakerydelivery;

/**
 *
 * @author Ralru
 */
public class Croissant extends Product {

    private String CroissantType;
    
    public Croissant(int ID, String name, String description, double price,String CroissantType) {
        super(ID, name, description, price);
       this.CroissantType=CroissantType;
    }

    @Override
    public double calcPrice() {
        return getPrice()+(getVAT()*getPrice());
    }

    public String getCroissantType() {
        return CroissantType;
    }

    public void setCroissantType(String CroissantType) {
        this.CroissantType = CroissantType;
    }

  
    public String toString(){
      return super.toString()+"\nCroissant Type : " +CroissantType ;    }


}
