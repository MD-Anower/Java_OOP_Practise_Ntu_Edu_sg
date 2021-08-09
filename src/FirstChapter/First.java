package FirstChapter;

public class First {
    private double radius ;
    private String color;



    First(){
        radius = 1.0;
        color = "red";

    }
    First(double r){
        radius = r;
        color = "red";
        System.out.println("this is the second constructor");
    }
    First(double r, String c){
        this.radius = r;
        this.color = c;
        System.out.println("this is the 3rd constructor");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return radius * radius * Math.PI;

    }
    public void printradius(){
        System.out.println(radius);
    }



    /*public double getAreaSecondConst(){
        return
    }*/

}

class FirstMain {
    public static void main(String[] args) {


        First first = new First();

        System.out.println("The FirstChapter.Circle has radius of "+first.getRadius()+
                " and area of FirstChapter.Circle is "+first.getArea());

        First first1 = new First(2.0);
        //first1.setRadius(2.0);
        System.out.println("this is the first1  "+first1);

        System.out.println("The FirstChapter.Circle has radius of "
                + first1.getRadius() + " and area of FirstChapter.Circle is " + first1.getArea());

        First first2 = new First(3.6,"Black");

        first2.setRadius(3.5);
        first2.setColor("Blue");

        System.out.println("This is the 3rd Constructor Here passed "+first2.getColor()+" color " +
                "and the radius is passed "+first2.getRadius()+" so the area is "+
                first2.getArea());
        first2.printradius();



    }
}

