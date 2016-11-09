/**
 * Created by wu673 on 9/14/16.
 */
public class Triangle {
    private double length;
    public Triangle(double length){
        this.length = length;
    }
    public double getPerimeter(){

        return 3 * this.length;
    }
    public double getArea(){

        return this.length * this.length * Math.sqrt(3)/4;
    }
}
