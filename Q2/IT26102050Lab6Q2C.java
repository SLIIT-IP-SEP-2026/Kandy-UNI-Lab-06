import java.util.Scanner;

public class IT26102050Lab6Q2C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int i = 0;
        int sum = 0;

        System.out.println("Please enter 10 numbers:");
        while (i < 10) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i]; // Accumulate the sum
            i++;
        }

        System.out.println("\nThe numbers you entered are:");
        i = 0;
        while (i < 10) {
            System.out.print(numbers[i] + " ");
            i++;
        }
        System.out.println();

        double average = (double) sum / numbers.length;

        System.out.println("\nSum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        scanner.close();
    }
}