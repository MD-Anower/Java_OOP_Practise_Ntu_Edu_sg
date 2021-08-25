package GeekForGeeks;

// Java program to illustrate
//the concept of Aggregation.
import java.io.*;
import java.util.*;

// student class
class Student {
    String name;
    int id ;
    String dept;

    Student(String name, int id, String dept)    {

        this.name = name;
        this.id = id;
        this.dept = dept;

    }

}

/* Department class contains list of student
Objects. It is associated with student
class through its Object(s). */
class Department {

    String name;
    private List<Student> students;
    Department(String name, List<Student> students)    {

        this.name = name;
        this.students = students;

    }

    public List<Student> getStudents()
    {
        return students;
    }
}

/* Institute class contains list of Department
Objects. It is asoociated with Department
class through its Object(s).*/
class Institute {

    String instituteName;
    private List<Department> departments;

    Institute(String instituteName, List<Department> departments)    {
        this.instituteName = instituteName;
        this.departments = departments;
    }

    // count total students of all departments
    // in a given institute
    public int getTotalStudentsInInstitute()    {
        int noOfStudents = 0;
        List<Student> students;
        for(Department dept : departments)
        {
            students = dept.getStudents();
            for(Student s : students)
            {
                noOfStudents++;
            }
        }
        return noOfStudents;
    }

}

// main method
class GFG {
    public static void main(String[] args) {
        Student student = new Student("Anower",10084,"CST");
        Student student1 = new Student("Jassica",10085,"CST");
        Student student2 = new Student("Abdullah",10086,"CST");
        Student student3 = new Student("Moyeen",10087,"CST");
        Student student4 = new Student("Hossain",10088,"CST");

        Student student5 = new Student("Anusha",20084,"EEE");
        Student student6 = new Student("Shujana",20085,"EEE");
        Student student7 = new Student("Fatiha",20086,"EEE");
        Student student8 = new Student("Sharmin",20087,"EEE");
        Student student9 = new Student("Hosana",20088,"EEE");



        List<Student> cse_Department = new ArrayList<Student>();
        cse_Department.add(student);
        cse_Department.add(student1);
        cse_Department.add(student2);
        cse_Department.add(student3);
        cse_Department.add(student4);

        List<Student > eee_Department =new ArrayList<>();
        eee_Department.add(student5);
        eee_Department.add(student6);
        eee_Department.add(student7);
        eee_Department.add(student8);
        eee_Department.add(student9);


        Department CST = new Department("Computer Science and Technology",cse_Department);
        Department EEE = new Department("Electrical Electronic Engineering",eee_Department);

        List<Department> departments = new ArrayList<>();
        departments.add(CST);
        departments.add(EEE);

        Institute institute = new Institute("CQUT",departments);

        System.out.print("Total students in institute: ");
        System.out.print(institute.getTotalStudentsInInstitute());


    }

}

