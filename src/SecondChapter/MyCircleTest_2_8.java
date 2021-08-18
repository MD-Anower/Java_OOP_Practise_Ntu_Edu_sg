package SecondChapter;

import org.w3c.dom.ls.LSOutput;

public class MyCircleTest_2_8 {
    public static void main(String[] args) {
        MyCircle_2_8 myCircle_2_8 = new MyCircle_2_8();
        System.out.println("This is default constructor's activity");
        System.out.println("*********************************************************************");
        System.out.println("\t"+myCircle_2_8);
        System.out.print("\tThis is Default constructor's Radius");
        System.out.println("\t"+myCircle_2_8.getRadius());
        System.out.print("\tThis is Default constructor's Center");
        System.out.println("\t"+myCircle_2_8.getCenter());
        System.out.print("\tThis is Default constructor's x Coordinator");
        System.out.println("\t"+myCircle_2_8.getCenterX());
        System.out.print("\tThis is Default constructor's y Coordinator");
        System.out.println("\t"+myCircle_2_8.getCenterY());
        System.out.print("\tThis is Default constructor's center XY");
        System.out.println("\t"+myCircle_2_8.getCenterXY());
        System.out.print("\tThis is Default constructor's Area");
        System.out.println("\t"+myCircle_2_8.getArea());
        System.out.print("\tThis is Default constructor's Circumference");
        System.out.println("\t"+myCircle_2_8.getCircumference());
        System.out.println("*********************************************************************");

        System.out.println("This is (int x, int y, int radius) constructor's activity");
        System.out.println("*********************************************************************");
        MyCircle_2_8 sec = new MyCircle_2_8(3,4,5);
        System.out.println("\t"+sec);
        System.out.print("\tThis is second constructor's Radius");
        System.out.println("\t"+sec.getRadius());
        System.out.print("\tThis is second constructor's Center");
        System.out.println("\t"+sec.getCenter());
        System.out.print("\tThis is second constructor's x Coordinator");
        System.out.println("\t"+sec.getCenterX());
        System.out.print("\tThis is second constructor's y Coordinator");
        System.out.println("\t"+sec.getCenterY());
        System.out.print("\tThis is second constructor's center XY");
        System.out.println("\t"+sec.getCenterXY());
        System.out.print("\tThis is second constructor's Area");
        System.out.println("\t"+sec.getArea());
        System.out.print("\tThis is second constructor's Circumference");
        System.out.println("\t"+sec.getCircumference());
        System.out.print("\tThis is second constructor's Distance");
        System.out.println("\t"+sec.distance(sec));
        System.out.println("*********************************************************************");

        System.out.println("This is (MyPoint_2_6 center, int radius) constructor's activity");
        System.out.println("*********************************************************************");
        MyPoint_2_6 third1 = new MyPoint_2_6(4,2);

        MyCircle_2_8 third = new MyCircle_2_8(third1,7);

        System.out.println("\t"+third);
        System.out.print("\tThis is third constructor's Radius");
        System.out.println("\t"+third.getRadius());
        System.out.print("\tThis is third constructor's Center");
        System.out.println("\t"+third.getCenter());
        System.out.print("\tThis is third constructor's x Coordinator");
        System.out.println("\t"+third.getCenterX());
        System.out.print("\tThis is third constructor's y Coordinator");
        System.out.println("\t"+third.getCenterY());
        System.out.print("\tThis is third constructor's center XY");
        System.out.println("\t"+third.getCenterXY());
        System.out.print("\tThis is third constructor's Area");
        System.out.println("\t"+third.getArea());
        System.out.print("\tThis is third constructor's Circumference");
        System.out.println("\t"+third.getCircumference());

        System.out.print("\tThis is third constructor's Distance");
        MyPoint_2_6 third2 = new MyPoint_2_6(5,3);
        System.out.println("\t"+third2.distance(third1));
        System.out.println("*********************************************************************");

    }

}
