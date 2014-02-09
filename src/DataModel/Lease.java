/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataModel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Thomas
 */
public class Lease {
    private Date startDate;
    private Date endDate;
    private int monthlyRate;
    private String room;
    private SimpleDateFormat SDF = new SimpleDateFormat("DD/MM/YYYY");
    
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
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getMonthlyRate() {
        return monthlyRate;
    }

    public void setMonthlyRate(int monthlyRate) {
        this.monthlyRate = monthlyRate;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
}
