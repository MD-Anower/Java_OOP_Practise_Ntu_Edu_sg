package SecondChapter;

import java.util.Scanner;

public class MyTriangleTest_2_9 {
    public static void main(String[] args) {
        MyTriangle_2_9 myTriangle_2_9 = new MyTriangle_2_9(2,1,4,3,6,5);
        System.out.println(myTriangle_2_9);



        //-4,0---4,0----0,0 iso
        //5,6---4,2----7,5 scalene

        System.out.println("Input the 6 Co-Ordinator: ");
        MyPoint_2_6 v1 = new MyPoint_2_6(new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt());
        MyPoint_2_6 v2 = new MyPoint_2_6(new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt());
        MyPoint_2_6 v3 = new MyPoint_2_6(new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt());
        MyTriangle_2_9 secConst = new MyTriangle_2_9(v1,v2,v3);
        System.out.println(secConst);

        System.out.println("The Perimeter is: "+secConst.getPerimeter());
        System.out.println("The Type of Triangle is: "+secConst.getType());
    }
}
