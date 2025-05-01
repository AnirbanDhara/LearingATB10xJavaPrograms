package ex_17_OOPs.Inheritance.real_example;

public class TestCase2 extends CommonToAllTestCase{

    void runningTC2()
    {
        startBrowser();
        readDataBaseFile();
        readExcelFile();
        System.out.println("Running TC2");
        closeBrowser();
    }
}
