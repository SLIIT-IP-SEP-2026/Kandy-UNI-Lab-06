import java.util.Scanner;


public class IT26102549Lab6Q2B{

    public static void main(String[]arg){
		
		Scanner sc =  new Scanner(System.in);
		
		int count=1,num;
		String nums= "";
		
		System.out.println("Please enter 10 numbers:");
		
		while(count<=10){
			
		System.out.print("Enter a number "+count+" : ");
		num = sc.nextInt();
		count ++;
		nums = nums + num +" ";
		}
		System.out.println("The numbers you entered are:");
		System.out.println(nums);
		
		}
		
	}
	