/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooc.yoursolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import ooc.enums.Make;

/**
 *
 * @author shyde
 */
public class BookingSystem implements BookingSystemInterface{

    @Override
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException {
        
        String input, name;                   //name defines the company name
        List<Car> cars = new ArrayList<>();   //input defines the vehicle data from the file
        name = in.readLine();
            
            while((input = in.readLine())!=null){        //definer list splits the data substrings ":" and classify it as make,rate/price and quantity
                String definer[] = input.split(":");
                
                Make make = Make.valueOf(definer[0]);         //using positional indexes in java to define various objects
                double rate = Double.parseDouble(definer[1]);
                int numOfCars = Integer.parseInt(definer[2]);
                
                for(int i=0;i<numOfCars;i++){       //a simmple for loop fills in the list with different cars and quantity
                    Car car = new Car(i,make,rate);
                    cars.add(car);
                }
            
        }       //returns the instance of RentACar class
            RentACarInterface rentACarInterface = new RentACar(cars,name);
            
            return rentACarInterface;
    }

}
    

