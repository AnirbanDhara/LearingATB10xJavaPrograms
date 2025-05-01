package ex_17_OOPs.polymorphism.example_real;

public class Kitchen {

    void food()
    {
        System.out.println("Juice is prepared");
    }

    void food(String str)
    {
        System.out.println(str+ " is prepared");
    }

    void food(String str, String f)
    {
        System.out.println(str + " "+ f +" is prepared");
    }
}
