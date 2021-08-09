package SecondChapter;

public class Book_2_1 {
    private String isbn;
    private String name;
    private Author_2_1 author21;
    private double price;
    private int qty = 0;

    public Book_2_1(String isbn, String name, Author_2_1 author21, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author21 = author21;
        this.price = price;
    }

    public Book_2_1(String isbn, String name, Author_2_1 author21, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author21 = author21;
        this.price = price;
        this.qty = qty;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author_2_1 getAuthor21() {
        return author21;
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

    public String  getAuthorName(){

        return name;
    }

    public String toString(){

        return "SecondChapter.Book[ isbn = "+isbn+", name = "+name+","
                + "SecondChapter.Author[name = "+ author21.getName()+", " +
                "email = "+ author21.getEmail()+"],"+
                "price = "+price+", qty = "+qty+"]";
    }

}

class TestBook {
    public static void main(String[] args) {
        // Test SecondChapter.Author class
        Author_2_1 a1 = new Author_2_1("Tan Ah Teck", "ahteck@nowhere.com");
        System.out.println(a1);

        a1.setEmail("ahteck@somewhere.com");
        System.out.println(a1);
        System.out.println("name is: " + a1.getName());
        System.out.println("email is: " + a1.getEmail());

        // Test SecondChapter.Book class
        Book_2_1 b1 = new Book_2_1("12345", "Java for dummies", a1, 8.8, 88);
        System.out.println(b1);

        b1.setPrice(9.9);
        b1.setQty(99);
        System.out.println(b1);
        System.out.println("isbn is: " + b1.getName());
        System.out.println("name is: " + b1.getName());
        System.out.println("price is: " + b1.getPrice());
        System.out.println("qty is: " + b1.getQty());
        System.out.println("author is: " + b1.getAuthor21());  // SecondChapter.Author's toString()
        System.out.println("author's name: " + b1.getAuthorName());
        System.out.println("author's name: " + b1.getAuthor21().getName());
        System.out.println("author's email: " + b1.getAuthor21().getEmail());
    }
}
