package MyTurn;

public class Customer {
    private int id;
    private String name;
    private String  gender;

    public Customer(int id, String name, String  gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String  getGender() {
        return gender;
    }


    public String toString(){

        return name+"(" +id+")";
    }

}
