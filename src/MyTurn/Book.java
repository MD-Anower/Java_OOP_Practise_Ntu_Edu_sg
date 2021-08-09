package MyTurn;

import java.util.Arrays;

public class Book {
    private  String name;
    // version 1 , one author
    //private SecondChapter.Author author;
    // version 2 , one more author
    private Author [] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author [] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public String toString(){

        /*return "SecondChapter.Book[name = "+name+", SecondChapter.Author [name = "+author.getName()+", email = "+author.getEmail()+
                ", gender = "+author.getGender()+"], Price = "+price+", qty = "+qty+"]";*/

        return "SecondChapter.Book[name = "+name+", \n " +
                "authors = {" + Arrays.toString(getAuthors()) +"]},\n " +
                "Price = "+price+", qty = "+qty+"]";

    }

    public String getAuthorsName(){

        return " ";
    }


}

class TestBook{
    public static void main(String[] args) {
       /* // Construct an author instance
        SecondChapter.Author ahTeck = new SecondChapter.Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);  // SecondChapter.Author's toString()

        SecondChapter.Book dummyBook = new SecondChapter.Book("Java for dummy", ahTeck, 19.95, 99);  // Test SecondChapter.Book's Constructor
        System.out.println(dummyBook);  // Test SecondChapter.Book's toString()

        // Test Getters and Setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("SecondChapter.Author is: " + dummyBook.getAuthor());  // SecondChapter.Author's toString()
        System.out.println("SecondChapter.Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("SecondChapter.Author's email is: " + dummyBook.getAuthor().getEmail());

        // Use an anonymous instance of SecondChapter.Author to construct a SecondChapter.Book instance
        SecondChapter.Book anotherBook = new SecondChapter.Book("more Java",
                new SecondChapter.Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);  // toString()*/


        // Declare and allocate an array of Authors
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        // Declare and allocate a SecondChapter.Book instance
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);  // toString()
    }
}
