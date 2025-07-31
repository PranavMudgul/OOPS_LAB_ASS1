import java.util.Scanner;

public class RecFact{

public int fact(int n){
     int total=1;

     if(n>=1){
     total= n*fact(n-1);

}
return total;
}

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter your number");
int num = sc.nextInt();

RecFact f = new RecFact();

int ans = f.fact(num);
System.out.print(ans);

}
}
