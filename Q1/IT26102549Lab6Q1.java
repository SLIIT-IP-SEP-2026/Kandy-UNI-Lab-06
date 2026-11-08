import java.util.Scanner;

public class IT26102549Lab6Q1{
	
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		double num,sq,sqrt;
		
		System.out.println("Enter a number:");
		num = sc.nextDouble();
		
		sq = num*num;
		sqrt = Math.sqrt(num);
		
		System.out.println("The square of:"+num+" is "+sq);
		System.out.println("The square root of:"+num+" is "+sqrt);
		
	sc.close();
	}
	
	
}