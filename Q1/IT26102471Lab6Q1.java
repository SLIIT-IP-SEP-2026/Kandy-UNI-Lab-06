import java.util.Scanner;

public class IT26102471Lab6Q1{
	public static void main(String[]args){
		double Number,square,square_root;
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number:");
		Number=input.nextDouble();
		
		square=Number*Number;
		square_root=Math.sqrt(Number);
		
		System.out.println("The square of" +Number+ "is:"+square);
		System.out.println("The square_root of" +Number+ "is:" +square_root);
	}
	
}

		
		
		