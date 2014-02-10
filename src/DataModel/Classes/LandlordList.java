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
public class LandlordList {
    private ArrayList<Landlord> list;
    
    public LandlordList(){
        this.list = new ArrayList<Landlord>();
    }
    
    public Boolean addLandlord(Landlord newLl){
        return this.list.add(newLl);
    }
    
    public Landlord getLandlordAt(int index){
        return this.list.get(index);
    }
    
}
