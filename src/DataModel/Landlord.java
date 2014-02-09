/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataModel;

import java.util.ArrayList;

/**
 * Landlord class, stores all the information regarding a landlord and all 
 * houses.
 * 
 * @author Thomas
 */
public class Landlord {
    private ArrayList<House> houses = new ArrayList<House>();
    private Address address;
    private String forename;
    private String surname;
    
    /**
     * Default constructor takes no arguments and passes no arguments to address.
     */
    public Landlord(){
        this.forename = "UNKNOWN";
        this.surname = "UNKNOWN";
        this.address = new Address();
    }
    
    /**
     * Constructor that doesn't take and address, only the forename and surname
     * arguments. Sets address to unknown.
     * @param forename
     * @param surname 
     */
    public Landlord(String forename, String surname){
        this.forename = forename;
        this.surname = surname;
        this.address = new Address();
    }
    
    /**
     * Constructor that takes full address, forename and surname arguments and 
     * stores them appropriately.
     * @param forename
     * @param surname
     * @param address
     * @param city
     * @param county
     * @param postcode 
     */
    public Landlord(String forename, String surname, String address,
            String city, String county, String postcode){
        this.forename = forename;
        this.surname = surname;
        this.address = new Address(address, city, county, postcode);
    }
    
    /**
     * Acessor for forename, setting the value of forename and return a boolean
     * value indicating if it's successful.
     * @param forename
     * @return 
     */
    public Boolean setforename(String forename){
        Boolean isDone = false;
        this.forename = forename;
        
        if (this.forename == forename)
            isDone = true;
        
        return isDone;
    }
    
    /**
     * Accessor for surname, setting the value of surname and returning a boolean
     * value indication if it's successful.
     * @param surname
     * @return 
     */
    public Boolean setSurname(String surname){
        Boolean isDone = false;
        this.surname = surname;
        
        if(this.surname == surname)
            isDone = true;
        
        return isDone;
    }
    
    /**
     * Accessor returning the value of the variable forename.
     * @return 
     */
    public String getforename(){
        return this.forename;
    }
    
    /**
     * Accessor returning the value of the variable surname.
     * @return 
     */
    public String getSurname(){
        return this.surname;
    }
    
    /**
     * Accessor returning the object at a specific location within the houses
     * array list.
     * @param index
     * @return 
     */
    public House getHouseAt(int index){
        return this.houses.get(index);
    }
    
    /**
     * Accessor returning the value of address within the address Address class
     * declaration.
     * @return 
     */
    public String getAddress(){
        return this.address.getAddress();
    }
    
    /**
     * Accessor setting the value of address within the address Address class
     * declaration, returning a Boolean value indicating it's success.
     * @param address
     * @return 
     */
    public Boolean setAddress(String address){
        return this.address.setAddress(address);
    }
    
    /**
     * Accessor returning the value of city within the address Address class
     * declaration.
     * @return 
     */
    public String getCity(){
        return this.address.getCity();
    }
    
    /**
     * Accessor setting the value of city within the address Address class
     * declaration, returning a Boolean value indicating it's success.
     * @param city
     * @return 
     */
    public Boolean setCity(String city){
        return this.address.setCity(city);
    }
    
    /**
     * Accessor getting the value of county within the address Address class
     * declaration.
     * @return 
     */
    public String getCounty(){
        return this.address.getCounty();
    }
    
    /**
     * Accessor setting the value of county within the address Address class
     * declaration, returning a Boolean value indicating it's success.
     * @param county
     * @return 
     */
    public Boolean setCounty(String county){
        return this.address.setCounty(county);
    }
    
    /**
     * Accessor getting the value of postcode within the address Address class
     * declaration.
     * @return 
     */
    public String getPostcode(){
        return this.address.getPostcode();
    }
    
    /**
     * Accessor setting the value of postcode within the address Address class
     * declaration, returning a Boolean value indicating it's success.
     * @param postcode
     * @return 
     */
    public Boolean setPostcode(String postcode){
        return this.address.setPostcode(postcode);
    }
}
