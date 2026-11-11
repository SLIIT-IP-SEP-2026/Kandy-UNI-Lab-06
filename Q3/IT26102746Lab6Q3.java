
import java.util.Scanner;

public class IT26102746Lab6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int count = 0;
        double sumOfSquares = 0;

        System.out.println("Enter positive integers (-99 to stop):");

        while (true) {
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if (number == -99) {
                break;
            }

            if (number < 0) {
                System.out.println("Invalid input! Please enter a positive number.");
                continue;
            }

            sumOfSquares = sumOfSquares + (double) number * number;
            count++;
        }

        if (count > 0) {
            double rms = Math.sqrt(sumOfSquares / count);
            System.out.println("Root Mean Square (RMS): " + rms);
        } else {
            System.out.println("No valid numbers were entered.");
        }

        input.close();
    }
}
