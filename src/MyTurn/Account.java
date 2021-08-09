package MyTurn;

public class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0;

    Account(int id, Customer customer){
        this.id = id;
        this.customer = customer;
    }
    Account(int id, Customer customer, int balance){
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, String tan_ah_teck, int balance) {
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String toString(){

        return customer.getName()+"("+customer.getId()+") balance = "+balance;
    }

    public String getCustomerName(){

        return customer.getName();
    }

    public Account deposit(double amount){
        balance = balance + amount;

        return this;
    }

    public Account withdraw(double amount){
        if(balance >= amount ){
            this.balance = balance - amount;
            System.out.println("AMount withdrawn");
        }
        else System.out.println("amount withdraw exceeds the current balance");

        return this;
    }



}

class TestAccount {
    public static void main(String[] args) {
        // Test constructor and toString()
        Account a1 = new Account(1001, "Tan Ah Teck", 88);
        System.out.println(a1);  // toString();
        FirstChapter.Account a2 = new FirstChapter.Account("A102", "Kumar"); // default balance
        System.out.println(a2);

        // Test Getters

        System.out.println(a1);
        System.out.println(a2);
    }
}
