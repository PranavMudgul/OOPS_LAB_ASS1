import java.util.*;

public class Prime_No{


public static void primeNo(int data){
	if(data<=1){
	System.out.println(data +" is not a prime no...");
	return;	

	}
	for(int i=2;i<Math.sqrt(data);i++){
	  if(data%i==0){
		System.out.println(data +" is not a prime no...");
		return;
	  }
	}
	System.out.println(data +" is a prime no...");
	return;
}
public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter no to check prime or not :- ");
int no = sc.nextInt();

primeNo(no);




}

}