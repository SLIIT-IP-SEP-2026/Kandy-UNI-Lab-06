import java.util.Scanner;

public class IT26102418Lab6Q2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int count = 1;
        int sum = 0;
        String numbersStr = "";
        
        System.out.println("Please enter 10 numbers:");
        
        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            int number = input.nextInt();
            
            sum = sum + number;
            numbersStr = numbersStr + number + " ";
            count++;
        }
        
        double average = (double) sum / 10;
        
        System.out.println();
        System.out.println("The numbers you entered are:");
        System.out.println(numbersStr);
        System.out.println();
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
    }
}