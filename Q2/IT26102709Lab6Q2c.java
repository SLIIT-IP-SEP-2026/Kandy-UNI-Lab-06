import java.util.Scanner;

public class IT26102709Lab6Q2c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int count = 0;
        int sum = 0;

        System.out.println("Please enter 10 numbers:");
        while (count < numbers.length) {
            System.out.print("Enter number " + (count + 1) + ": ");
            numbers[count] = input.nextInt();
            sum += numbers[count];
            count++;
        }

        System.out.println("\nThe numbers you entered are:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        double average = sum / 10.0;
        System.out.println("\n\nSum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        input.close();
    }
}