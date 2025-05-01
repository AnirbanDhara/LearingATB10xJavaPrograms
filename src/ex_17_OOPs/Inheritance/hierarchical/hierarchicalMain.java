package ex_17_OOPs.Inheritance.hierarchical;

public class hierarchicalMain {
    public static void main(String[] args){
        Son1 s1 = new Son1();
        s1.h1();
        s1.home();

        Son2 s2 = new Son2();
        s2.h2();
        s2.home();

        Sister sis = new Sister();
        sis.h3();
        sis.home();
    }
}
