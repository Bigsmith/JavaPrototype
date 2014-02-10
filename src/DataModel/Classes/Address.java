/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataModel.Classes;

/**
 * Used to quickly store the address for an object.
 * 
 * The variable address stores the first two lines of an address, such as the
 * street and house number/name. City stores the town, city, hamlet etc; county
 * stores the county and the postcode the postcode.
 * @author Thomas
 */
public class Address {
    private String address;
    private String city;
    private String county;
    private String postcode;
    
    /**
     * Default constructor, takes no arguments and sets all to "UNKNOWN".
     */
    public Address(){
        String address = "UNKNOWN";
        String city = "UNKNOWN";
        String county = "UNKNOWN";
        String postcode = "UNKNOWN";
    }
    
    /**
     * Constructor for Address, takes four arguments and stores them..
     * @param address
     * @param city
     * @param county
     * @param postcode 
     */
    public Address(String address, String city, String county, String postcode){
        this.address = address;
        this.city = city;
        this.county = county;
        this.postcode = postcode;
    }

    /**
     * Returns the address.
     * @return 
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address and returns a Boolean value notifying if it's been set
     * successfully.
     * @param address
     * @return 
     */
    public Boolean setAddress(String address) {
        Boolean isDone = false;
        this.address = address;
        
        if (this.address == address)
            isDone = true;
        
        return isDone;
    }

    /**
     * Returns the value stored in city.
     * @return 
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the City and returns a Boolean value notifying if it's been set
     * successfully.
     * @param city
     * @return 
     */
    public Boolean setCity(String city) {
        Boolean isDone = false;
        this.city = city;
        
        if (this.city == city)
            isDone = true;
        
        return isDone;
    }

    /**
     * Returns the county.
     * @return 
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the County and returns a Boolean value notifying if it's been set
     * successfully.
     * @param county
     * @return 
     */
    public Boolean setCounty(String county) {
        Boolean isDone = false;
        this.county = county;
        
        if(this.county == county)
            isDone = true;
        
        return isDone;
    }

    /**
     * Returns the postcode.
     * @return 
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the Postcode and returns a Boolean value notifying if it's been set
     * successfully.
     * @param postcode
     * @return 
     */
    public Boolean setPostcode(String postcode) {
        Boolean isDone = false;
        this.postcode = postcode;
        
        if (this.postcode == postcode)
            isDone = true;
        
        return isDone;
    }
    
    /**
     * Returns the entire address as a single string, the format "address, city, county, postcode".
     * @return 
     */
    public String getAsString(){
        return this.address + ", " + this.city + ", " + this.county + ", " + this.postcode; 
    }
    
    
}
