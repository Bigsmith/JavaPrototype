/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LeaveRecords.Interfaces;

/**
 *
 * @author Thomas Smith
 */
public interface ISubject{
    /**
     * registers a new observer
     * @param o
     * @return 
     */
    public boolean registerObserver(IObserver o);
    
    /**
     * Removes an observer
     * @param o
     * @return 
     */
    public boolean removeObserver(IObserver o);
    
    /**
     * Notifies the Observers
     */
    public void notifyObservers();
}
