/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakerydelivery;

/**
 *
 * @author Ralru
 */
public class Address {
    private String city;
    private String street;
    private String district;
    private String houseNumber;
    
    public Address(String city, String street, String district, String houseNumber){
        this.city = city;
        this.street = street;
        this.district = district;
        this.houseNumber = houseNumber;  
    }
    public void setCity(String city){
     this.city= city;     
    }
    public String getCity(){ 
        return city; 
    }
    public void setStreet(String street){
     this.street= street;     
    }
    public String getStreet(){ 
        return street; 
    }
    public void setDistrict(String district){
     this.district= district;     
    }
    public String getDistrict(){ 
        return district; 
    }
    public void setHouseNumber(String houseNumber){
     this.houseNumber= houseNumber;     
    }
    public String getHouseNumber(){ 
        return houseNumber; 
    }
    @Override
    public String toString(){
        return "city :" +city+ "\nstreet : " + street + "\ndistrict : " +district +"\nhouseNumber : " +houseNumber;
    }
}