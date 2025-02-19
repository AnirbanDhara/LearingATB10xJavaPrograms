package Constructors;

public class Lab_001 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Maruti", "2008");
        Car car3 = new Car("Tesla","2021");
        System.out.println("Model of car1:" + car1.model);
        System.out.println("Year of the car1:"+ car1.year);
        System.out.println("Model of car2:" + car2.model);
        System.out.println("Year of the car2:"+ car2.year);
        System.out.println("Model of car3:" + car3.model);
        System.out.println("Year of the car3:"+ car3.year);
    }
}
