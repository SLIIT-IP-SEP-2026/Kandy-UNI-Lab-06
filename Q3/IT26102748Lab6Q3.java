import java.util.Scanner;

public class IT26102748Lab6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int count = 0;
        double sumOfSquares = 0;

        System.out.println("Enter positive integers (terminate input with -99):");

        while (true) {
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if (number == -99) {
                break;
            } else if (number < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
            } else {
                sumOfSquares += number * number;
                count++;
            }
        }

        System.out.println();

        if (count > 0) {
            double rms = Math.sqrt(sumOfSquares / count);
            System.out.println("The Root Mean Square (RMS) is: " + rms);
        } else {
            System.out.println("No valid numbers were entered.");
        }
    }
}