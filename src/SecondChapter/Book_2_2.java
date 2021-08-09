package SecondChapter;

public class Book_2_2 {
    private String name;
    private Author_2_1 [] author_2_1;
    private double price;
    private int qty = 0;
    public Book_2_2(String name, Author_2_1[] author_2_1, double price){
        this.name = name;
        this.author_2_1 = author_2_1;
        this.price = price;

    }
    public Book_2_2(String name, Author_2_1[] author_2_1, double price, int qty){
        this.name = name;
        this.author_2_1 = author_2_1;
        this.price = price;
        this.qty = qty;

    }

    public String getName(){

        return name;
    }
    public Author_2_1[] getAuthor_2_1(){

        return author_2_1;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public String toString(){
        return "";
    }
    public String getAuthorNames(){

        return getAuthorNames();
    }

}
