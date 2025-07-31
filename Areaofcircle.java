import java.util.*;

public class Areaofcircle {

    public static void area(float radius) {
        double area;
        area = Math.PI * radius * radius;

        System.out.println("Area of circle is: " + area);
    }

    public static void main(String[] args) {

        float radius;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius:");
        radius = sc.nextFloat();

        area(radius);

     
    }
}
