import java.util.Scanner;

public class IT26102549Lab6Q3{
	
	public static void main(String[]args){
		
		Scanner sc =  new Scanner (System.in);
		
		int num=1,count=0;
		double multi=0,root;
		
		System.out.println("Enter positive Integers(terminate input with -99):");
		
		while (num!=-99){
			System.out.print("Enter a number:");
			num = sc.nextInt();
			
			if(num<0&&num!=-99){
				System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
			}
		    else if(num>0){	
				count++;	
		        multi = multi + num*num;
			}
		
		}
		
		root = Math.sqrt(multi/count);
		
		System.out.print("The Root Mean Square (RMS) is:"+root);
		
	}
}