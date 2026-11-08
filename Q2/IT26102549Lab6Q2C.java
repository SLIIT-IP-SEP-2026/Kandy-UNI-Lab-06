import java.util.Scanner;

public class IT26102549Lab6Q2C{
	
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter 10 numbers:");
		
		int nums,count=1,sum=0;
		double avg;
		String numC="";
		
		while(count<=10){
			
			System.out.print("Enter number"+count+":");
			nums = sc.nextInt();
			count++;
			sum = sum + nums;
			numC = numC + nums + " ";
		}
		
		avg = sum/count;
		
		System.out.println("The numbers you entered are:\n"+numC);
		System.out.println("Sum of the numbers:"+sum);
		System.out.println("Average of the numbers:"+avg);
		
		
	}
}