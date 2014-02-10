/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tests;

import DataModel.Classes.*;
import DataModel.Interfaces.IObserver;
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
        this.editData();
    }
    
    public void generateData(){
        IObserver observer = new AnObserver();
        this.landlordList.registerObserver(observer);
        
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
        System.out.println("Adding landlord to landlord list");
        this.landlordList.addLandlord(newLandlord);
        System.out.println("Adding house to landlord");
        this.landlordList.getLandlordAt(0).addHouse(newHouse);
        System.out.println("Adding lease to house");
        this.landlordList.getLandlordAt(0).getHouseAt(0).addLease(newLease);
    }
    
    public void editData(){
        System.out.println("Editing lease rate");
        this.landlordList.getLandlordAt(0).getHouseAt(0).getLeaseAt(0).setMonthlyRate(80);
        System.out.println("Editing house number");
        this.landlordList.getLandlordAt(0).getHouseAt(0).setAddress("10 Wyndham Square");
        System.out.println("Editing number of legal occupants");
        this.landlordList.getLandlordAt(0).getHouseAt(0).setLegalOcc(6);
        System.out.println("Editing landlord forename");
        this.landlordList.getLandlordAt(0).setforename("John");
        System.out.println("Editing Landlord surname");
        this.landlordList.getLandlordAt(0).setSurname("Johnson");
    }
    
    private class AnObserver implements IObserver{

        @Override
        public void update() { System.out.println("State change detected."); }
       
    }
}
