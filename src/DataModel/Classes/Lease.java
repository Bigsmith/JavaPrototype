/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataModel.Classes;

import LeaveRecords.Interfaces.IObserver;
import LeaveRecords.Interfaces.ISubject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Thomas
 */
public class Lease implements ISubject{
    private Date startDate;
    private Date endDate;
    private int monthlyRate;
    private String room;
    private SimpleDateFormat SDF = new SimpleDateFormat("DD/MM/YYYY");
    private ArrayList<IObserver> observers = new ArrayList<>();
    
    public Lease() throws ParseException{
        this.startDate = this.SDF.parse("01/01/1999");
        this.endDate = this.SDF.parse("02/01/1999");
        this.monthlyRate = 0;
        this.room = "UNKNOWN";
    }
    
    public Lease(Date startDate, Date endDate, int monthlyRate, String room){
        this.startDate = startDate;
        this.endDate = endDate;
        this.monthlyRate = monthlyRate;
        this.room = room;
        this.notifyObservers();
    }

    public Date getStartDate() {
        return startDate;
        
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
        this.notifyObservers();
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
        this.notifyObservers();
    }

    public int getMonthlyRate() {
        return monthlyRate;
    }

    public void setMonthlyRate(int monthlyRate) {
        this.monthlyRate = monthlyRate;
        this.notifyObservers();
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
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
