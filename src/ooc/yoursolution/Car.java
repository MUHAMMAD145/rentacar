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
    public void setMake(Make make) { //setter method for the make of the cars
        this.make = make;
    }

    @Override
    public double getRate() { //return the rate of the cars
        return rate;
    }

    @Override
    public void setRate(double rate) { //setter for rate
        this.rate = rate;
    }

    @Override
    public Map getAvailability() { //returns the map
        return map;
    }

    @Override
    public void setAvailability(Map availability) { //setting availability for the calender
    this.map = map;
    }

    @Override
    public int getId() { //returns the id
        return id;
    }

    @Override
    public boolean isAvailable(Month month, int day) {//this boolean function defines if a particular day is availiable or not
       Boolean[] available = map.get(month);          // **we use(-1) in the function because the index in java functions start at 0  
       if (available[day-1]==null){
           available[day-1] = true;
       }
       return available[day-1];
    }

    @Override
    public boolean book(Month month, int day) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
