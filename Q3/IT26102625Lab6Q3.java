import java.util.Scanner;
public class IT26102625Lab6Q3{
	public static void main(String[]args){
	

  int a , count=0  , sq = 0;
  Scanner input = new Scanner(System.in);	
  
  System.out.println("Input positive integers (terminate the input with -99):");
  System.out.println("Enter the number:");
		a = input.nextInt();
		
		
		
  while(a!=-99)
  {
		if(a<=0)
	{
		System.out.println("Invalid input. please enter a positive integer or -99 to terminate");
	}			
		
		else
		{	
		sq = sq + (a*a);
		count ++ ;
		}
		
		{	
		System.out.println("Enter the number:");
		a = input.nextInt();
		
		}
  }	
		
		
	if(a == -99)
	{	
      double rms = Math.sqrt(sq/count);

		System.out.println("The Root Mean Square (RMS) is :" +rms);
	}	
		
		
		
	}
}