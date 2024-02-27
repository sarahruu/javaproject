/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakerydelivery;

/**
 *
 * @author Ralru
 */
public abstract class Product {
    private final int ID;
    private String name;
    private String description;
    private double price;
    private final static double VAT=0.15;
 
    public Product(int ID,String name,String description,double price){
       this.ID=ID;
       this.name=name;
       this.description=description;
       this.price=price;
    }
    
    public abstract double calcPrice();
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static double getVAT() {
        return VAT;
    }
    
    public String toString(){
      return "ID : " +ID +"\nname : "+name+ "\ndescription :"+ description+"\nPrice :"+price;  
    }



}
