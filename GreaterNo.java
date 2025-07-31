import java.util.*;
public class GreaterNo{

public static void main(String[] args){
   
Scanner sc = new Scanner(System.in);
 System.out.println("A :- ");
 int a= sc.nextInt();
 System.out.println("B :- ");
int b=sc.nextInt();
  if(a==b){
System.out.print("Both are equal....");
}else if(a>b){
  System.out.print(a+" is greater no...");
}else{
  System.out.print(b+" is greater no...");
}


  
}
}