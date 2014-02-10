/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tests;

import DataModel.Classes.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thomas
 */
public class TestClass {
    private LandlordList landlordList;
    private Landlord newLandlord;
    private House newHouse;
    private Lease newLease;
    private SimpleDateFormat SDF;
    
    public TestClass(){ 
        this.landlordList = new LandlordList();
        this.SDF = new SimpleDateFormat("DD/MM/YYYY");
    }
    
    public void runTests(){
        this.generateData();
        this.addToModel();
        this.displayData();
    }
    
    public void generateData(){
        this.newLandlord = new Landlord("Bob", "Bobson", "5 some road", "Some city"
        , "Devon", "PL1 5AZ");
        
        this.newHouse = new House("8 Wyndham Square", "Plymouth", "Devon", "PL1 5EF"
                , 10, "It's a house", 6, "old", "yes", 8);
        try {
            this.newLease = new Lease(this.SDF.parse("01/08/2013"),
                    this.SDF.parse("06/07/2014"), 63, "3");
        } catch (ParseException ex) {
            Logger.getLogger(TestClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addToModel(){
        this.newHouse.addLease(newLease);
        this.newLandlord.addHouse(newHouse);
        this.landlordList.addLandlord(newLandlord);
    }
    
    public void displayData(){
        System.out.println(this.landlordList.getLandlordAt(0).getforename());
        System.out.println(this.landlordList.getLandlordAt(0).getHouseAt(0).getAddress());
        System.out.println(this.landlordList.getLandlordAt(0).getHouseAt(0).getLeaseAt(0).getRoom());
    }
}
