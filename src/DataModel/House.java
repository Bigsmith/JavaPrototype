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
public class House{
    private Address address;
    private int lateFee;
    private String description;
    private int noRooms;
    private String housetype;
    private String pets;
    private int legalOcc;
    
    public House(){
        this.address.setAddress("UNKNOWN");
        this.address.setCity("UNKNOWN");
        this.address.setCounty("UNKNOWN");
        this.address.setPostcode("UNKNOWN");
        this.lateFee = 0;
        this.description = "UNKNOWN";
        this.noRooms = 0;
        this.housetype = "UNKNOWN";
        this.pets = "UNKNOWN";
        this.legalOcc = 0;  
    }
    
    public House(String address, String city, String county, String postcode, 
            int lateFee, String description, int noRooms, String housetype, String pets, int LegalOcc){
        
        this.address.setAddress(address);
        this.address.setCity(city);
        this.address.setCounty(county);
        this.address.setPostcode(postcode);
        this.lateFee = lateFee;
        this.description = description;
        this.noRooms = noRooms;
        this.housetype = housetype;
        this.pets = pets;
        this.legalOcc = legalOcc;
    }
    
    public Boolean setAddress(String address){
        return this.address.setAddress(address); 
    }
    
    public String getAddress(){
        return this.address.getAddress();
    }
    
    public Boolean setCity(String city){
        return this.address.setCity(city);
    }
    
    public String getCity(){
        return this.address.getCity();
    }
    
    public Boolean setCounty(String county){
        return this.address.setCounty(county);
    }
    
    public String getCounty(){
        return this.address.getCounty();
    }
    public Boolean setPostcode(String postcode){
        return this.address.setPostcode(postcode);
    }
    
    public String getPostcode(){
        return this.address.getPostcode();
    }
}
