/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataModel.Classes;

import DataModel.Interfaces.IObserver;
import DataModel.Interfaces.ISubject;
import java.util.ArrayList;

/**
 *
 * @author Thomas
 */
public class LandlordList implements IObserver, ISubject{
    private ArrayList<Landlord> list;
    private transient ArrayList<IObserver> observers = new ArrayList<>();
    
    public LandlordList(){
        this.list = new ArrayList<Landlord>();
    }
    
    public Boolean addLandlord(Landlord newLl){
        Boolean isDone = this.list.add(newLl);
        newLl.registerObserver(this);
        this.notifyObservers();
        return isDone;
    }
    
    public Landlord getLandlordAt(int index){
        return this.list.get(index);
    }
    
    public ArrayList<Landlord> getList(){
        return this.list;
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
