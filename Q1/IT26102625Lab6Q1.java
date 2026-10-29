import java.util.Scanner;
public class IT26102625Lab6Q1{
	public static void main(String[]Args){
		
	Scanner input= new Scanner(System.in);

double a , s , sq ;

System.out.println("Enter the number:");
a = input.nextDouble();

	s = a*a;
	sq = Math.sqrt(a);
		
		
		
	System.out.println("The square of"+" "+a+" "+"is:" +s);	
	System.out.println("The square root of"+" " +a +" "+"is:" +sq);
		
		
	
	}
}