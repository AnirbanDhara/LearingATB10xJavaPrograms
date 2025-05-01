package ex_17_OOPs.Inheritance.real_example;

public class TestCase1 extends CommonToAllTestCase{

    void runningTC1()
    {
        startBrowser();
        System.out.println("Running TC1");
        closeBrowser();
    }

    void readExcelFile() {
        System.out.println("Read Excel File and Close Excel File");
    }
}
