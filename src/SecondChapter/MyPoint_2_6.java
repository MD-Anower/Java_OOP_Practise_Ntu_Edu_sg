package SecondChapter;

import java.text.DecimalFormat;
import java.util.Arrays;

public class MyPoint_2_6 {
    private int x = 0;
    private int y = 0;
    public MyPoint_2_6(){

    }
    public MyPoint_2_6(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int [] getXY(){

        return new int[]{x, y};
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;

    }

    public String toString(){
        return "("+x+","+y+")";
    }

    public String distance(int x , int y){
        DecimalFormat df2 = new DecimalFormat("#.##");

        //String.format("%.2f"+Math.sqrt((x-this.x) * (x-this.x) + (y-this.y) * (y-this.y)));
        //df2.format(Math.sqrt((x-this.x) * (x-this.x) + (y-this.y) * (y-this.y)));
        double ans = Math.sqrt((x-this.x) * (x-this.x) + (y-this.y) * (y-this.y));

        return df2.format(ans);
    }
    public String distance(MyPoint_2_6 another){
        DecimalFormat df3 = new DecimalFormat("#.###");

        return df3.format(Math.sqrt((this.x-another.x) * (this.x-another.x) +
                (this.y - another.y) * (this.y - another.y)));
    }
    public String  distance(){
        DecimalFormat df3 = new DecimalFormat("#.###");

        return df3.format(Math.sqrt((this.x) * (this.x) + (this.y) * (this.y)));
    }

}

class TestMyPoint_2_6 {
    public static void main(String[] args) {

        System.out.println("A method called distance(int x, int y) that returns " +
                "the distance from this point to another point at the given (x, y) coordinates, e.g");

        MyPoint_2_6 p1 = new MyPoint_2_6(3, 4);
        System.out.println(p1.distance(5, 6));

        System.out.println("An overloaded distance(MyPoint another) that returns " +
                "the distance from this point to the given MyPoint instance (called another)");

        MyPoint_2_6 p2 = new MyPoint_2_6(7, 8);
        MyPoint_2_6 p3 = new MyPoint_2_6(9, 10);
        System.out.println(p2.distance(p3));

        System.out.println("Another overloaded distance() method that returns " +
                "the distance from this point to the origin (0,0), e.g.");

        MyPoint_2_6 p4 = new MyPoint_2_6(11, 12);
        System.out.println(p4.distance());


        // Test program to test all constructors and public methods
        MyPoint_2_6 p5 = new MyPoint_2_6();  // Test constructor
        System.out.println(p5);      // Test toString()
        p5.setX(8);   // Test setters
        p5.setY(6);
        System.out.println("x is: " + p5.getX());  // Test getters
        System.out.println("y is: " + p5.getY());
        p5.setXY(3, 0);   // Test setXY()
        System.out.println("getting xy is "+p5.getXY()[0]);  // Test getXY()
        System.out.println("getting xy is "+p5.getXY()[1]);
        System.out.println("The p5 points is "+p5);

        MyPoint_2_6 p6 = new MyPoint_2_6(0, 4);  // Test another constructor
        System.out.println("The p6 points is "+p6);
// Testing the overloaded methods distance()
        System.out.println(p5.distance(p6));    // which version?
        System.out.println(p6.distance(p5));    // which version?
        System.out.println(p5.distance(5, 6));  // which version?
        System.out.println(p5.distance());      // which version?


        /*
        Write a program that allocates 10 points in an array of MyPoint,
        and initializes to (1, 1), (2, 2), ... (10, 10).
        Hints: You need to allocate the array, as well as each of the 10 MyPoint instances.
        In other words, you need to issue 11 new, 1 for the array and 10 for the MyPoint instances.
        */

        MyPoint_2_6[] points = new MyPoint_2_6[10];  // Declare and allocate an array of MyPoint

        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint_2_6(i+1,i+1);    // Allocate each of MyPoint instances
        }
        // use a loop to print all the points

        System.out.println(Arrays.toString(points));      // Test toString()

    }
}
