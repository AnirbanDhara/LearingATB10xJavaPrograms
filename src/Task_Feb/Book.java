package Task_Feb;

abstract class Book {
    String name;
    String author;
    int price;

    Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    abstract void getDetails();
}
