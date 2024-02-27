/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakerydelivery;

/**
 *
 * @author Ralru
 */
public class Coffee extends Product {
    private String coffeeType;
    
    public Coffee(int ID, String name, String description, double price,String coffeeType) {
        super(ID, name, description, price);
        this.coffeeType=coffeeType;
    }

    @Override
    public double calcPrice() {
        return getPrice()+(getVAT()*getPrice());
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
    }

   
    public String toString(){
      return super.toString()+"\nCoffee Type : " +coffeeType ;    }

}
