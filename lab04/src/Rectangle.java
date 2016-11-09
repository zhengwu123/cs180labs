/**
 * Created by wu673 on 9/14/16.
 */
public class Rectangle {
    private double width;
    private double length;
    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    public double getPerimeter(){

        return 2 * (this.length+this.width);
    }
    public double getArea(){

        return this.length * this.width;
    }

}
