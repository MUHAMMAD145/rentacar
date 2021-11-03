/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooc.yoursolution;

import java.util.HashMap;
import java.util.Map;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author shyde
 */
public class Car implements CarInterface{
    
    //creating the 4 elements described for the car.
    private int id;
    private Make make;
    private double rate;
    private Map<Month, Boolean[]>map;

    /*
    This method creates the availability of the car for the whole year and also defines the car attributes
    */
    public Car(int id,Make make,double rate){
        this.id = id;
        this.make = make;
        this.rate = rate;
        createAvailability();
        
    }
    
    @Override
    public Map createAvailability() { //creating a map to input the enums all at once for better convinience defined and return the map for availability
     map = new HashMap<>();             

    map.put(Month.JANUARY, new Boolean[31]);
    map.put(Month.FEBRUARY, new Boolean[28]);
    map.put(Month.MARCH, new Boolean[31]);
    map.put(Month.APRIL, new Boolean[30]);
    map.put(Month.MAY, new Boolean[31]);
    map.put(Month.JUNE, new Boolean[30]);
    map.put(Month.JULY, new Boolean[31]);
    map.put(Month.AUGUST, new Boolean[31]);
    map.put(Month.SEPTEMBER, new Boolean[30]);
    map.put(Month.OCTOBER, new Boolean[31]);
    map.put(Month.NOVEMBER, new Boolean[30]);
    map.put(Month.DECEMBER, new Boolean[31]);

        return map;
    }

    @Override
    public Make getMake() { //returning the make of the cars
        return make;
    }

    @Override
    public void setMake(Make make) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getRate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRate(double rate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Map<Month, boolean[]> getAvailability() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAvailability(Map<Month, boolean[]> availability) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isAvailable(Month month, int day) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean book(Month month, int day) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
