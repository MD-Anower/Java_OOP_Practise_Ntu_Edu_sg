package SecondChapter;

public class Invoice_2_4 {
    private int id;
    private Customer_2_4 customer24;
    private double amount;

    public Invoice_2_4(int id, Customer_2_4 customer24, double amount) {
        this.id = id;
        this.customer24 = customer24;
        this.amount = amount;
    }

    public int getId(){
        return id;
    }

    public Customer_2_4 getCustomer24() {
        return customer24;
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCustomer24(Customer_2_4 customer24) {
        this.customer24 = customer24;
    }

    public int getCustomerId(){


        return customer24.getId();
    }

    public String getCustomerName(){


        return customer24.getName();
    }

    public int getCustomerDiscount(){


        return customer24.getDiscount();
    }

    public double getAmountAfterDiscount(){


        return amount;
    }

    public String toString(){

        return "Invoice[id="+id+", " +
                "customer="+ customer24.getName()+"("+ customer24.getId()+")"+"("+ customer24.getDiscount()+"%),"
                +"amount="+amount;
    }

}
