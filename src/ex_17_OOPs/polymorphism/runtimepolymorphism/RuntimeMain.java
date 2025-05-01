package ex_17_OOPs.polymorphism.runtimepolymorphism;

public class RuntimeMain {
    public static void main(String[] args){
        Child ch = new Child();
        ch.home();

        Mother mh = new Mother();
        mh.home();

        Mother m1 = new Child(); // Dynamic Dispatch
        m1.home(); // Method Overriding --- Overridden Mother method
    }
}
