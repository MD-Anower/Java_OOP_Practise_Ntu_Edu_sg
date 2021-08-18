package SecondChapter;

public class MyCircle_2_8 {
    private MyPoint_2_6 center;
    private int radius = 1;

    public MyCircle_2_8(){
        center = new MyPoint_2_6(0,0);


    }
    public MyCircle_2_8(int x, int y, int radius){

        center = new MyPoint_2_6(x,y);
        this.radius = radius;
    }
    public MyCircle_2_8(MyPoint_2_6 center, int radius){
        System.out.println("3rd constructor called");
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint_2_6 getCenter() {
        return center;
    }

    public void setCenter(MyPoint_2_6 center) {
        this.center = center;
    }

    public int getCenterX(){
        return center.getX();
    }
    public void setCenterX(int x){
        this.center.setX(x);
    }
    public int getCenterY(){
        return center.getY();
    }
    public void setCenterY(int y){
        this.center.setY(y);
    }


    public int[] getCenterXY(){
        return center.getXY();
    }
    public void setCenterXY(int x, int y){
        this.center.setXY(x,y);
    }

    @Override
    public String toString(){
        return "MyCircle[radius = "+this.radius+",center=("+center.getX()+","+center.getY()+")]";
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
    public String distance(MyCircle_2_8 another){
        return center.distance(another.center);
    }
}
