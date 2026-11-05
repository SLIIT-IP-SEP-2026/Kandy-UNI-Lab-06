import java.util.Scanner;

public class IT26102408Lab6Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sumSquares = 0;

        System.out.println("Enter positive integers (terminate input with -99):");

        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number == -99) {
                break;
            }

            if (number < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
                continue;
            }

            sumSquares += Math.pow(number, 2);
            count++;
        }

        System.out.println();

        if (count > 0) {
            double rms = Math.sqrt(sumSquares / count);
            System.out.println("The Root Mean Square (RMS) is: " + rms);
        }

        scanner.close();
    }
}