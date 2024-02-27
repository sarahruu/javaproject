/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakerydelivery;

/**
 *
 * @author Ralru
 */
public class Customer {
    private String name;
    private String phoneNumber;
    private Address address;
    public Customer (String name ,String phoneNumber ,Address address) {
       this.name = name;
       this.phoneNumber = phoneNumber;
       this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    @Override
    public String toString () {
        return "name : " +name +"\nphoneNumber : "+phoneNumber+ "\n- address -\n"+ getAddress() ;
    }
    
    
    
}
 