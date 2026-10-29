import java.util.Scanner;
public class IT26102625Lab6Q2C {
	public static void main(String[]args) {
	 
  Scanner input= new Scanner(System.in);	
  
  int []num=new int[10];
  int a=0,sum=0;
  double avg=0;
  
  System.out.println("Please enter 10 numbers:");
 
  while(a<10)
  {
		System.out.println("Enter the number" +(a+1) +":");
		num[a] = input.nextInt();
		sum+=num[a];
		a++ ;
  }	
		
		
		System.out.print("The number you entered are:");
		a=0;
  while(a<10)
  {
		System.out.print(num[a] +"  "); 
	    a++ ;
  }

  
		avg=sum/10.0;
		System.out.println();
		System.out.println("sum of the numbers" +sum);
		System.out.println("Average of the numbers" +avg);
		
		
  	
	}
}