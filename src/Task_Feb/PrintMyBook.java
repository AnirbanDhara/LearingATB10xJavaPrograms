package Task_Feb;

public class PrintMyBook extends Book{
    PrintMyBook(String name , String author, int price){
        super(name, author, price);
    }
    @Override
    void getDetails() {
        System.out.println(name + " "+ author + " "+ price);
    }

}
