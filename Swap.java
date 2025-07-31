import java.util.Scanner;
public class Swap{
public static void main(String[] args){


Scanner sc= new Scanner(System.in);
System.out.println("enter value of A:-");
int a = sc.nextInt();
System.out.println("enter value of B:-");
int b = sc.nextInt();

a=a+b;
b=a-b;
a=a-b;
System.out.println("A:="+ a);
System.out.println("A:="+ b);
}
}