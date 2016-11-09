/**
 * Created by wu673 on 9/14/16.
 */
public class Circle {
    private double radius;

    public Circle(double radius){
       this.radius = radius;
    }
    public double getCircumference(){

        return 2 * this.radius * Math.PI;
    }
    public double getArea(){

        return this.radius * this.radius * Math.PI;
    }
}
