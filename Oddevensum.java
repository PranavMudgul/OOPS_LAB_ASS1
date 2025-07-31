import java.util.Scanner;

public class Oddevensum{
public static void main(String[] args){

int n, sumE=0,sumO=0;

Scanner sc = new Scanner(System.in);
System.out.println("enter the size of array");
n=sc.nextInt();

int arr[] = new int[n];
System.out.println("enter the element ");
for(int i=0;i<=n;i++){

arr[i] = sc.nextInt();
}

for(int i=0;i<=n;i++){
if(arr[i]%2==0){
sumE+=arr[i];
}
else{
sumO+=arr[i];
}
}
System.out.println("the sum of even no is "+sumE);
System.out.println("the sum of odd no is "+sumO);
}

}
