package SecondChapter;

import jdk.swing.interop.SwingInterOpUtils;

public class MyTriangle_2_9 {
    private MyPoint_2_6 v1;
    private MyPoint_2_6 v2;
    private MyPoint_2_6 v3;

    public MyTriangle_2_9(int x1, int y1, int x2, int y2, int x3, int y3){
        v1 = new MyPoint_2_6(x1,y1);
        v2 = new MyPoint_2_6(x2,y2);
        v3 = new MyPoint_2_6(x3,y3);
        System.out.println("First constructor called ");
    }
    public MyTriangle_2_9(MyPoint_2_6 v1, MyPoint_2_6 v2, MyPoint_2_6 v3){



        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        System.out.println("Second constructor called");
    }
    public String toString(){
        return "MyTriangle[v1=("+v1.getX()+","+v1.getY()+")," +
                " v2=("+v2.getX()+","+v2.getY()+") v3=("+v3.getX()+","+v3.getY()+")]";
    }
    public String getPerimeter(){
        // here return type is String because of the formatting after decimal point.
        String v1dis = v1.distance(v2);
        //System.out.println(v1dis);
        String v2dis = v2.distance(v3);
        //System.out.println(v2dis);
        String v3dis = v1.distance(v3);
        //System.out.println(v3dis);
        double ppppp = Double.parseDouble(v1dis) + Double.parseDouble(v2dis) + Double.parseDouble(v3dis);
        //System.out.println("the perimeter is :"+ppppp);
        return ""+ppppp;
    }
    public String getType(){
        if(v1.distance(v2).equals(v2.distance(v3)) && v1.distance(v2).equals(v3.distance(v1))){
            return "Equilateral";
        }
        else if(v1.distance(v2).equals(v2.distance(v3)) || v1.distance(v2).equals(v1.distance(v3))
                || v1.distance(v3).equals(v2.distance(v3))){
            return "Isosceles";
        }
        else
            return "Scalene";
    }
}
