import java.util.Scanner;
public class IT26102050Lab6Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        double sumOfSquares = 0;
        
        System.out.println("Enter positive integers (terminate input with -99):");
        
        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            
            // Check for termination sentinel
            if (number == -99) {
                break;
            }
            
            // Validate for negative input (other than -99)
            if (number < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
                continue;
            }
            
            // Accumulate values
            sumOfSquares += (double) number * number;
            count++;
        }
        
        scanner.close();
        
        // Calculate and display Root Mean Square if numbers were entered
        if (count > 0) {
            double rms = Math.sqrt(sumOfSquares / count);
            System.out.println("\nThe Root Mean Square (RMS) is: " + rms);
        } else {
            System.out.println("\nNo numbers were entered.");
        }
    }
}