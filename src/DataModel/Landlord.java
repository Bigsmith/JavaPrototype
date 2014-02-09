/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataModel;

import java.util.ArrayList;

/**
 *
 * @author Thomas
 */
public class Landlord {
    private ArrayList<House> houses = new ArrayList<House>();
    private Address address;
    private String forname;
    private String surname;
    
    public Landlord(){
        this.forname = "UNKNOWN";
        this.surname = "UNKNOWN";
        this.address = new Address();
    }
    
    public Landlord(String forname){
        this.forname = forname;
        this.surname = "UNKNOWN";
        this.address = new Address();
    }
    
    public Landlord(String forname, String surname){
        this.forname = forname;
        this.surname = surname;
        this.address = new Address();
    }
    
    public Boolean setForname(String forname){
        Boolean isDone = false;
        this.forname = forname;
        
        if (this.forname == forname)
            isDone = true;
        
        return isDone;
    }
    
    public Boolean setSurname(String surname){
        Boolean isDone = false;
        this.surname = surname;
        
        if(this.surname == surname)
            isDone = true;
        
        return isDone;
    }
    
    public String getForname(){
        return this.forname;
    }
    
    public String getSurname(){
        return this.surname;
    }
    
    private House getHouseAt(int index){
        return this.houses.get(index);
    }
    
}
