/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataModel.Classes;

import java.util.ArrayList;

/**
 * 
 * @author Thomas
 */
public class House{
    private ArrayList<Lease> leaseList = new ArrayList<Lease>();
    private Address address;
    private int lateFee;
    private String description;
    private int noRooms;
    private String housetype;
    private String pets;
    private int legalOcc;
    
    /**
     * Default constructor for the house class, setting all Strings to UNKNOWN
     * and all integers to 0.
     */
    public House(){
        this.address = new Address();
        this.lateFee = 0;
        this.description = "UNKNOWN";
        this.noRooms = 0;
        this.housetype = "UNKNOWN";
        this.pets = "UNKNOWN";
        this.legalOcc = 0;  
    }
    
    /**
     * Full constructor for the house class, fully populating the the class'
     * variables and all of the variables within the Address class declaration
     * address.
     * @param address
     * @param city
     * @param county
     * @param postcode
     * @param lateFee
     * @param description
     * @param noRooms
     * @param housetype
     * @param pets
     * @param legalOcc 
     */
    public House(String address, String city, String county, String postcode, 
            int lateFee, String description, int noRooms, String housetype, String pets, int legalOcc){
        
        this.address = new Address(address, city, county, postcode);
        this.lateFee = lateFee;
        this.description = description;
        this.noRooms = noRooms;
        this.housetype = housetype;
        this.pets = pets;
        this.legalOcc = legalOcc;
    }
    /**
     * Accessor for Address, setting the value of address and returning a Boolean
     * value.
     * @param address
     * @return 
     */
    public Boolean setAddress(String address){
        return this.address.setAddress(address); 
    }
    
    /**
     * Accessor for Address, returning its value.
     * @return 
     */
    public String getAddress(){
        return this.address.getAddress();
    }
    
    /**
     * Accessor for City, setting the value of city within the address variable.
     * Returns a Boolean value.
     * @param city
     * @return 
     */
    public Boolean setCity(String city){
        return this.address.setCity(city);
    }
    
    /**
     * Accessor for city, getting the value of city within the address variable.
     * @return 
     */
    public String getCity(){
        return this.address.getCity();
    }
    
    /**
     * Accessor for county, sets the value of county within the address variable.
     * Returns boolean value depending on it's success.
     * @param county
     * @return 
     */
    public Boolean setCounty(String county){
        return this.address.setCounty(county);
    }
    
    /**
     * Accessor for county, returns the value of county within the address variable.
     * @return 
     */
    public String getCounty(){
        return this.address.getCounty();
    }
    
    /**
     * Accessor for postcode, sets the value of postcode within the address variable.
     * Returns boolean value depending on it's success.
     * @param postcode
     * @return 
     */
    public Boolean setPostcode(String postcode){
        return this.address.setPostcode(postcode);
    }
    
    /**
     * Accessor for the postcode, gets the value of postcode within the address variable.
     * @return 
     */
    public String getPostcode(){
        return this.address.getPostcode();
    }

    /**
     * Accessor for lateFee, returning it's value.
     * @return 
     */
    public int getLateFee() {
        return lateFee;
    }

    /**
     * Accessor for lateFree, setting it's value and returning a boolean depending
     * on it's success.
     * @param lateFee
     * @return 
     */
    public Boolean setLateFee(int lateFee) {
        Boolean isDone = false;
        this.lateFee = lateFee;
        
        if (this.lateFee == lateFee)
            isDone = true;
        
        return isDone;
    }

    /**
     * Accessor for description, returning its value.
     * @return 
     */
    public String getDescription() {
        return description;
    }

    /**
     * Accessor for description, setting its value and returning a boolean value
     * depending on it's success.
     * @param description
     * @return 
     */
    public Boolean setDescription(String description) {
        Boolean isDone = false;
        this.description = description;
        
        if (this.description == description)
            isDone = true;
        
        return isDone;
    }

    /**
     * Access for noRooms, returning it's value.
     * @return 
     */
    public int getNoRooms() {
        return noRooms;
    }
    
    /**
     * Accessor for noRooms, setting it's value and returning a boolean depending
     * on its success.
     * @param noRooms
     * @return 
     */
    public Boolean setNoRooms(int noRooms) {
        Boolean isDone = false;
        this.noRooms = noRooms;
        
        if (this.noRooms == noRooms)
            isDone = true;
        
        return isDone;
    }
    
    /**
     * Accessor for houseType, returning its value.
     * @return 
     */
    public String getHousetype() {
        return housetype;
    }

    /**
     * Accessor for the houseType, setting its value and returning a boolean
     * depending on it's value.
     * @param housetype
     * @return 
     */
    public Boolean setHousetype(String housetype) {
        Boolean isDone = false;
        this.housetype = housetype;
        
        if(this.housetype == housetype)
            isDone = true;
        
        return isDone;
    }
    
    /**
     * Accessor for pets, returning it's value.
     * @return 
     */
    public String getPets() {
        return pets;
    }

    /**
     * Accessor for pets, setting it's value and returning a boolean depending
     * on its success.
     * @param pets
     * @return 
     */
    public Boolean setPets(String pets) {
        Boolean isDone = false;
        this.pets = pets;
        
        if (this.pets == pets)
            isDone = true;
        
        return isDone;
    }

    /**
     * Accessor for legalOcc, returning its value.
     * @return 
     */
    public int getLegalOcc() {
        return legalOcc;
    }

    /**
     * Accessor for legalOcc, setting its value and returning a boolean value
     * depending on its success.
     * @param legalOcc
     * @return 
     */
    public Boolean setLegalOcc(int legalOcc) {
        Boolean isDone = false;
        this.legalOcc = legalOcc;
        
        if (this.legalOcc == legalOcc)
            isDone = true;
        
        return isDone;
    }
    
    /**
     * Accessor for lease, returning a lease in the leastList at a specific given lease.
     * @param index
     * @return 
     */
    public Lease getLeaseAt(int index){
        return this.leaseList.get(index);
    }
    
    /**
     * Accessor for leastList, adding a least to the list and returning a boolean value 
     * depending on its success.
     * @param newLease
     * @return 
     */
    public Boolean addLease(Lease newLease){
        return this.leaseList.add(newLease);
    }
}
