package ex_17_OOPs.Inheritance.real_example;

public class TestMain {
    public static void main(String[] args){
        TestCase1 TC1 = new TestCase1();
        TC1.runningTC1();
        System.out.println("---------------");
        //TestCase2 TC2 = new TestCase2();
        //TC2.runningTC2();

        CommonToAllTestCase CTA = new TestCase1(); // Dynamic Binding or object creation
        CTA.readExcelFile(); // invoking overridden instance method

    }
}
