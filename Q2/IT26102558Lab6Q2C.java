import java.util.Scanner;

public class IT26102558Lab6Q2C {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int sum = 0;
        double average;

        System.out.println("Please enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();

            sum = sum + numbers[i];
        }

        average = (double) sum / 10;

        System.out.println();
        System.out.println("The numbers you entered are:");

        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.println("Sum of the numbers = " + sum);
        System.out.println("Average of the numbers = " + average);
    }
}