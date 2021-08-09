package FirstChapter;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;

    }

    public int getId() {

        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public  String getLastName(){

        return lastName;
    }
    public String getName(){

        return firstName+" "+lastName;
    }
    public int getSalary(){

        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;

    }
    public int getAnnualSalary(){

        return salary*12;
    }
    public int raiseSalary(int percent){
        //double ans  = salary * (percent / (double) 100);
        //return salary+(int)ans;
        return (int) (salary+(salary * (percent / (double)100)));
    }
    public String toString(){

        return "FirstChapter.Employee[id="+id+", name="+firstName+" "+lastName+", salary="+salary+"]";
    }
}

class TestEmployee{
    public static void main(String[] args) {
        // Test constructor and toString()
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(e1);  // toString();

        // Test Setters and Getters
        e1.setSalary(999);
        System.out.println(e1);  // toString();
        System.out.println("id is: " + e1.getId());
        System.out.println("first name is: " + e1.getFirstName());
        System.out.println("last name is: " + e1.getLastName());
        System.out.println("salary is: " + e1.getSalary());

        System.out.println("name is: " + e1.getName());
        System.out.println("annual salary is: " + e1.getAnnualSalary()); // Test method

        // Test raiseSalary()
        System.out.println(e1.raiseSalary(10));
        System.out.println(e1);

    }
}
