import java.util.*;

public class Areaoftrangle{

public static void area(float height, float base){

float area;
area = (height*base)/2;

System.out.println("area of trangle is"+ area);
}

public static void main(String[] args){

float base,height;

Scanner sc= new Scanner(System.in);

System.out.println("enter the height");
height= sc.nextFloat();
System.out.println("enter the base");
base = sc.nextFloat();

area(height,base);


}
}