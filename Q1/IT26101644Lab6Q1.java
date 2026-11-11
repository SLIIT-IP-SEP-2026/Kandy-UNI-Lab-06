import java.util.Scanner;

public class IT26101644Lab6Q1{
	public static void main(String[] args) {
		
		double num , square , squareRoot;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		num = input.nextDouble();
		
		square = num * num ;
		squareRoot = Math.sqrt(num);
		
		System.out.println("The square of "+ num+ " is : " + square);
		System.out.println("The square root of "+ num+ " is : " + squareRoot);
		
	}
	
}