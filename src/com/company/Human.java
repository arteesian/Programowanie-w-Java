package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Human {
    public String firstName;
    public String lastName;
    protected String phone;
    public Animal pet;
    private Car car;
    private Double salary;

    public Double getSalary(){
        if(salary != null) {
            System.out.println(salary);
            return salary;
        }else{
            System.out.println("You don't have a salary");
            return null;
        }
    }

    public void setSalary(double salary){
        if(salary < 0){
            System.out.println("The payment is below 0");
        }else{
            System.out.println("The new data has been sent to the accounting system");
            System.out.println("Do not forget to pick up the annex to the contract from Mrs. Hania from HR");
            System.out.println("ZUS and US already know about the change in payment");
            this.salary = salary;
        }
    }

    public Car getCar(){
        return car;
    }

    public void setCar (Car car){
        if(getSalary() > car.value){
            System.out.println("The car can be bought for cash");
            this.car = car;
        }
        else if(getSalary() > (car.value/12)){
            System.out.println("The car can be bought for credit");
            this.car = car;
        }else{
            System.out.println("You cannot afford this car");
        }
    }

    @Override
    public String toString(){
        return "Name: " + firstName + " " + lastName + ", pet: " + pet + ", car: " + car + ", salary: " + salary;
    }
}
