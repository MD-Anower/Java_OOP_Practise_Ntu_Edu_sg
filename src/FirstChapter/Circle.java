package FirstChapter;

public class Circle {
    private double radius = 1.0;

    Circle(){

    }
    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){

        return Math.PI*radius*radius;
    }
    public double getCircumference(){

        return 2*Math.PI*radius;
    }
    public String toString(){

        return "FirstChapter.Circle[radius="+radius+"]";
    }
}

class TestCircle {
    public static void main(String[] args) {
        // Test Constructors and toString()
        Circle c1 = new Circle(1.1);
        System.out.println(c1);   // toString()
        Circle c2 = new Circle(); // default constructor
        System.out.println(c2);

        // Test setter and getter
        c1.setRadius(2.2);
        System.out.println(c1);      // toString()
        System.out.println("radius is: " + c1.getRadius());

        // Test getArea() and getCircumference()
        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());
    }
}
