/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataModel.Classes;


import DataModel.Interfaces.ISubject;
import DataModel.Interfaces.IObserver;
import java.util.ArrayList;

/**
 * Landlord class, stores all the information regarding a landlord and all 
 * houses.
 * 
 * @author Thomas
 */
public class Landlord implements IObserver, ISubject{
    private ArrayList<House> houses = new ArrayList<House>();
    private ArrayList<IObserver> observers = new ArrayList<>();
    private Address address;
    private String forename;
    private String surname;
    private String emailAddress;
    
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
    public Landlord(String forename, String surname, String emailAddress){
        this.forename = forename;
        this.surname = surname;
        this.address = new Address();
        this.emailAddress = emailAddress;
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
            String city, String county, String postcode, String emailAddress){
            this.forename = forename;
            this.surname = surname;
            this.address = new Address(address, city, county, postcode);
            this.emailAddress = emailAddress;
    }
    
    /**
     * Constructor for landlord that takes an Address object.
     * @param forename
     * @param surname
     * @param address 
     */
    public Landlord(String forename, String surname, Address address, String emailAddress){
        this.forename = forename;
        this.surname = surname;
        this.address = address;
        this.emailAddress = emailAddress;
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
        
        this.notifyObservers();
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
        
        this.notifyObservers();
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
     * Accessor adding a house to the house array list. Returns a Boolean value
     * indicating its success.
     * @param house
     * @return 
     */
    public Boolean addHouse(House house){
        Boolean isDone = this.houses.add(house);
        house.registerObserver(this);
        this.notifyObservers();
        return isDone;
    }
    
    public Boolean setEmail(String emailAddress){
        Boolean isDone = false;
        this.emailAddress = emailAddress;
        
        if (this.emailAddress.equals(emailAddress))
            isDone = true;
        
        this.notifyObservers();
        
        return isDone;
    }
    
    public String getEmail(){
        return this.emailAddress;
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
        Boolean isDone = this.address.setAddress(address);
        this.notifyObservers();
        return isDone;
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
        Boolean isDone = this.address.setCity(city);
        this.notifyObservers();
        return isDone;
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
        Boolean isDone = this.address.setCounty(county);
        this.notifyObservers();
        return isDone;
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
        Boolean isDone = this.address.setPostcode(postcode);
        this.notifyObservers();
        return isDone;
    }
    
    public String getFullname(){
        return this.surname + ", " + this.forename;
    }
    
    @Override
    public void update() {
        this.notifyObservers();
    }

    @Override
    public boolean registerObserver(IObserver o) {
        Boolean binAdded = false;
        if (o != null) {
            if (this.observers == null) { 
                this.observers = new ArrayList<>();
            }
            binAdded = this.observers.add(o);
        }
        return binAdded;
    }

    @Override
    public boolean removeObserver(IObserver o) {
        Boolean binRemoved = false;
        if (o != null) {
            binRemoved = this.observers.remove(o);
        }
        return binRemoved;
    }

    @Override
    public void notifyObservers() {
        if (this.observers != null && this.observers.size() > 0) {
            for (IObserver currentObserver : this.observers) {
                currentObserver.update();
            }
        }
    }
}
