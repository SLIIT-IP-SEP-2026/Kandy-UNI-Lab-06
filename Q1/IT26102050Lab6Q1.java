import java.util.Scanner;

public class IT26102050Lab6Q1 {
	
	public static void main(String[] args) {
		double num, squ_num, squ_root;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: " );
		num = input.nextDouble();
		
		squ_num = num * num ;
		System.out.println("The squre of "+ num + " is : "+ squ_num );
		
		squ_root = Math.sqrt(num);
		System.out.println("The squre root of "+num + " is : "+ squ_root );
		
	}
}	