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
        this.address = new Address();
        this.lateFee = 0;
        this.description = "UNKNOWN";
        this.noRooms = 0;
        this.housetype = "UNKNOWN";
        this.pets = "UNKNOWN";
        this.legalOcc = 0;  
    }
    
    public House(String address, String city, String county, String postcode, 
            int lateFee, String description, int noRooms, String housetype, String pets, int LegalOcc){
        
        this.address = new Address(address, city, county, postcode);
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

    public int getLateFee() {
        return lateFee;
    }

    public void setLateFee(int lateFee) {
        this.lateFee = lateFee;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNoRooms() {
        return noRooms;
    }

    public void setNoRooms(int noRooms) {
        this.noRooms = noRooms;
    }

    public String getHousetype() {
        return housetype;
    }

    public void setHousetype(String housetype) {
        this.housetype = housetype;
    }

    public String getPets() {
        return pets;
    }

    public void setPets(String pets) {
        this.pets = pets;
    }

    public int getLegalOcc() {
        return legalOcc;
    }

    public void setLegalOcc(int legalOcc) {
        this.legalOcc = legalOcc;
    }
    
    
}
