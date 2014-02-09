/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataModel;

/**
 *
 * @author Thomas
 */
public class Address {
    private String address = "UNKNOWN";
    private String city = "UNKNOWN";
    private String county = "UNKNOWN";
    private String postcode = "UNKNOWN";
    
    public Address(){}
    
    public Address(String address, String city, String county, String postcode){
        this.address = address;
        this.city = city;
        this.county = county;
        this.postcode = postcode;
    }

    public String getAddress() {
        return address;
    }

    public Boolean setAddress(String address) {
        Boolean isDone = false;
        this.address = address;
        
        if (this.address == address)
            isDone = true;
        
        return isDone;
    }

    public String getCity() {
        return city;
    }

    public Boolean setCity(String city) {
        Boolean isDone = false;
        this.city = city;
        
        if (this.city == city)
            isDone = true;
        
        return isDone;
    }

    public String getCounty() {
        return county;
    }

    public Boolean setCounty(String county) {
        Boolean isDone = false;
        this.county = county;
        
        if(this.county == county)
            isDone = true;
        
        return isDone;
    }

    public String getPostcode() {
        return postcode;
    }

    public Boolean setPostcode(String postcode) {
        Boolean isDone = false;
        this.postcode = postcode;
        
        if (this.postcode == postcode)
            isDone = true;
        
        return isDone;
    }
    
    public String getAsString(){
        return this.address + ", " + this.city + ", " + this.county + ", " + this.postcode; 
    }
    
    
}
