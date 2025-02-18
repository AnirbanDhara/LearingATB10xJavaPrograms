package Task_Feb;

public class Abstraction {
    static public void main(String[] args){
    Book mybook = new PrintMyBook("Harry Potter","J.K.Rowling", 120);
    mybook.getDetails();
    }
}
