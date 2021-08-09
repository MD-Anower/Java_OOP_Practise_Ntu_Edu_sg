package SecondChapter;


public class MyLine_2_7 {
    private MyPoint_2_6 begin;
    private MyPoint_2_6 end;

    MyLine_2_7(MyPoint_2_6 begin, MyPoint_2_6 end){
        this.begin = begin;
        this.end = end;

    }
    MyLine_2_7(int beginX, int beginY, int endX, int endY){
        begin = new MyPoint_2_6 (beginX,beginY);
        end = new MyPoint_2_6(endX,endY);

    }

    public MyPoint_2_6 getBegin() {
        return begin;
    }

    public void setBegin(MyPoint_2_6 begin) {
        this.begin = begin;
    }

    public MyPoint_2_6 getEnd() {
        return end;
    }

    public void setEnd(MyPoint_2_6 end) {
        this.end = end;
    }
    public int getBeginX(){
        return begin.getX();
    }

    public void setBeginX(int x){
        begin.setX(x);
    }
    public int getBeginY(){
        return begin.getY();
    }
    public void setBeginY(int y){
        begin.setY(y);
    }
    public int getEndX(){
        return end.getX();
    }
    public void setEndX(int x){
        end.setX(x);
    }
    public int getEndY(){
        return end.getY();
    }
    public void setEndY(int y){
        end.setY(y);
    }


    public int[] getBeginXY(){

        return new int[]{begin.getX(),begin.getY()};
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    public int[] getEndXY(){

        return new int[]{end.getX(),end.getY()};
    }
    public void setEndXY(int x, int y){
        end.setXY(x,y);

    }
    public double getLength(){

        return Math.sqrt((getEndX()-getBeginX())*(getEndX()-getBeginX())) +
                ((getEndY() - getBeginY())*(getEndY() - getBeginY()));
    }
    public double getGradient(){

        return Math.atan2(getEndY() - getBeginY(), getEndX() - getBeginX());
    }
    public String toString(){

        return "MyLine_2_7[Begin = ("+ getBeginX() +","+getBeginY()+"), end = ("+getBeginX()+","+getBeginY()+")]";
    }

}

class TestMyLine {

    public static void main(String[] args) {
        MyLine_2_7 l1 = new MyLine_2_7(3, 2, 7, 4);
        System.out.println(l1);
        System.out.println("udhgjdsfhvgsdfmjhgsd");
        l1.getBeginXY();
        System.out.println("fhdjkhbdsfgj");

        MyPoint_2_6 p1 = new MyPoint_2_6(4, 9);
        MyPoint_2_6 p2 = new MyPoint_2_6(3, 4);
        MyLine_2_7 l2   = new MyLine_2_7(p1, p2);
        System.out.println(l2);

        System.out.println("Line 1 length: " + l1.getLength());
        System.out.println("Line 1 gradient: " + l1.getGradient());

        System.out.println("Line 2 length: " + l2.getLength());
        System.out.println("Line 2 gradient: " + l2.getGradient());
    }

}
