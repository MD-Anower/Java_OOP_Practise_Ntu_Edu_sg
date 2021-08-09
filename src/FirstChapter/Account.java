package FirstChapter;

public class Account {
    private final String id;
    private final String name;
    private int balance = 0;

    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount){
        balance = balance+amount;
        return balance;
    }
    public int debit(int amount){
        if(amount<=balance){
            balance = balance-amount;
        }
        else System.out.println("Amount Exceeded Balance");

        return balance;
    }
    public int transferTo(Account another, int amount){

        int bal = another.balance;

        if(amount<=balance){
            another.balance = amount;
            balance = balance - amount;

            System.out.println("Transferred "+amount+" TK ");
            System.out.println("_________From________");
            System.out.println("-----------------------------------\n"+
                    "This ***"+this.id+"*** id\n"+
                    "This ***"+this.name+"*** name\n"+
                    "The Rest of the balance is ***"+this.balance+"*** TK\n"+
                    "-----------------------------------\n"
            );
            System.out.println("_________To__________");
            System.out.println("-----------------------------------\n"+
                    "This ***"+another.id+"*** id\n"+
                            "This ***"+another.name+"*** name\n"+
                            "After Added the balance is ***"+another.balance+"*** TK\n"+
                    "previous balance was "+bal+" TK\n"+
                    "-----------------------------------\n"
            );
        }
        else System.out.println("Amount Exceeded Balance");



        return balance;
    }
    public String toString(){

        return "FirstChapter.Account[id="+id+", name="+name+", balance="+balance+"]";
    }

}

class TestAccount {
    public static void main(String[] args) {
        // Test constructor and toString()
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        System.out.println(a1);  // toString();
        Account a2 = new Account("A102", "Kumar"); // default balance
        System.out.println(a2);

        // Test Getters
        System.out.println("ID: " + a1.getId());
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance: " + a1.getBalance());

        // Test credit() and debit()
        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500);  // debit() error
        System.out.println(a1);

        // Test transfer()
        a1.transferTo(a2, 100);  // toString()
        System.out.println(a1);
        System.out.println(a2);
    }
}
