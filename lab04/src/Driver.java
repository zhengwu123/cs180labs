import java.util.Scanner;

/**
 * Created by wu673 on 9/14/16.
 */
public class Driver {
    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input circle radius:");

        double radius = scanner.nextDouble();

        System.out.println("Input Triangle length:");

        double tlength = scanner.nextDouble();

        System.out.println("Input Rectangle width and length:");

        double width = scanner.nextDouble();
        double length = scanner.nextDouble();

        //print circle first.
        Circle circle = new Circle(radius);
        double circum = circle.getCircumference();
        double carea = circle.getArea();
        System.out.format("Circle circumference: %f%n",circum);
        System.out.format("Circle Area:%f%n",carea);

        //print triangle
        Triangle triangle = new Triangle(tlength);
        double tcircum = triangle.getPerimeter();
        double tarea = triangle.getArea();
        System.out.format("triangle perimeter: %f%n",tcircum);
        System.out.format("triangle Area:%f%n",tarea);

        //print rectangle
        Rectangle rectangle = new Rectangle(length,width);
        double rcircum = rectangle.getPerimeter();
        double rarea = rectangle.getArea();
        System.out.format("rectangle perimeter: %f%n",rcircum);
        System.out.format("rectangle Area:%f%n",rarea);

    }
}
