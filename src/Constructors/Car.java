package Constructors;

public class Car {
    String model;
    String year;

    Car(){
        // Default Constructor
        model = "XXXX";
        year = "2014";
    }

    Car(String model, String year){
        // Parameterized Constructor
        this.model = model;
        this.year = year;
    }
}

