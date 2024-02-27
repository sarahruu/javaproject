/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakerydelivery;

/**
 *
 * @author Ralru
 */
public class Sweets extends Product {
    private String sweetType;
    
    public Sweets(int ID, String name, String description, double price,String sweetType) {
        super(ID, name, description, price);
       this.sweetType=sweetType;
    }
    @Override
    public double calcPrice() {
        return getPrice()+(getVAT()*getPrice());
    }

    public String getSweetType() {
        return sweetType;
    }

    public void setSweetType(String sweetType) {
        this.sweetType = sweetType;
    }
    public String toString(){
        return super.toString() +"\nsweetType : "+sweetType;
    }
}
