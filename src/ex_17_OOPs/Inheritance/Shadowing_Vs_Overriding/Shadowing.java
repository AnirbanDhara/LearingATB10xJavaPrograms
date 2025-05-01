package ex_17_OOPs.Inheritance.Shadowing_Vs_Overriding;

class Shadowing {
    String name = "Shadowing Instance Variable";
    static String cls = "Shadowing Static Variable";

    static void display(){
       System.out.println("In Static Method of Superclass");
    }

    void instanceMethod(){
        System.out.println("In instance Method of Super Class");
    }
}

class ShadowingTest extends Shadowing{
    String name = "Shadowing Test Instance Variable";
    static String cls = "Shadowing Test Static Variable";

    // Static Methods are not Overridden but Shadowed
    static void display(){
        System.out.println("In Static Method of Subclass");
    }

    //instance Methods are Overridden not Shadowed
    void instanceMethod(){
        System.out.println("The Overridden instance Method in Subclass");
    }

    public static void main(String[] args){
        Shadowing s = new ShadowingTest();
        //ShadowingTest st = new Shadowing(); Derived Class ref. variable can't refer Base Class Object

        //invokes the superclass display as they are early binded at Compile Time
        s.display();

        //invokes superclass instance varible
        System.out.println(s.name);

        //invokes superclass static variable
        System.out.println(s.cls);

        // invokes the Overridden version as they are dynamically/late binded at runtime
        s.instanceMethod();

        System.out.println("---------------");

        ShadowingTest st = new ShadowingTest();

        //invokes the Sub Class display as they are early binded at Compile Time
        st.display();

        //invokes sub class instance varible
        System.out.println(st.name);

        //invokes sub class static varible
        System.out.println(st.cls);

        //invokes the Overridden version as they are dynamically/late binded at runtime
        st.instanceMethod();
    }
}
