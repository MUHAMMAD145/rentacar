/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooc.yoursolution;

import java.util.List;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author shyde
 */
public class RentACar implements RentACarInterface{

    private List <Car>cars;
    private String name;
    
    public RentACar (List<Car> Cars, String name){
        this.cars = cars;
        this.name = name;
    }
    @Override
    public List getCars() {
        return cars;
    }

    @Override
    public void setCars(List cars) {
        this.cars = cars;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean checkAvailability(Month month, int day, Make make, int lengthOfRent) {
        int currentDay,flagDay;
        for(Car car:cars){
            if(car.getMake().equals(make)){
                flagDay = 0;
                currentDay = day;
                for(int i=0; i<lengthOfRent; i++){
                
                    if(!car.isAvailable(month, day++)){
                    flagDay = 1;
                    break;
                }
            }
                if(flagDay == 0){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int getCarAvailable(Month month, int day, Make make, int lengthOfRent) {
                int currentDay,flagDay;
        for(Car car:cars){
            if(car.getMake().equals(make)){
                flagDay = 0;
                currentDay = day;
                for(int i=0; i<lengthOfRent; i++){
                
                    if(!car.isAvailable(month, day++)){
                    flagDay = 1;
                    break;
                }
            }
                if(flagDay == 0){
                    return car.getId();
                }
            }
        }
        return -1;
    }

    @Override
    public boolean bookCar(Month month, int day, Make make, int lengthOfRent) {
        if(!checkAvailability(month,day,make,lengthOfRent)){
            return false;
        }
        int carId = getCarAvailable(month,day,make,lengthOfRent);
        
        for(Car car:cars){
            if(car.getId()==carId&&car.getMake()==make){
                int currentDay = day;
                for(int i=0; i<lengthOfRent;i++){
                    car.book(month, day++);
                    
                    }
                }
            }
            return true;
        }
        

    @Override
    public int getNumberOfCars() {
        return cars.size();
    }
    
}
