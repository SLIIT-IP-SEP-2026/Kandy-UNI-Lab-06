import java.util.Scanner;

public class IT26102471Lab6Q3{
	public static void main(String[]args){
		int Number,Count=0;
		double Sum_of_Squares=0,Root_Mean_Square;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter positive integers(terminate input with -99):");
		
		System.out.println("Enter a Number:");
		Number=input.nextInt();
		
		while(Number!=-99){
			if(Number<0){
				System.out.println("Invalid input.Please enter a positive integer or -99 to terminate");
			}else{
				Sum_of_Squares=Sum_of_Squares+(Number*Number);
				Count++;
			}
			System.out.println("Enter a number:");
			Number=input.nextInt();
		}
		if(Count>0){
			Root_Mean_Square=Math.sqrt(Sum_of_Squares/Count);
			System.out.println("The Root mean square (RMS) is: " +Root_Mean_Square);
		}else{
			System.out.println("No valid numbers were entered");
		}
		input.close();
	}
}

			
			
 

				