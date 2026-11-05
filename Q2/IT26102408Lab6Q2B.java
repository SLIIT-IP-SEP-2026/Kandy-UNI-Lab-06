import java.util.Scanner;

public class IT26102408Lab6Q2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int count = 0;

        System.out.println("Please enter 10 numbers:");

        while (count < 10) {
            System.out.print("Enter number " + (count + 1) + ": ");
            numbers[count] = scanner.nextInt();
            count++;
        }

        System.out.println("\nThe numbers you entered are:");

        count = 0;
        while (count < 10) {
            System.out.print(numbers[count] + " ");
            count++;
        }
        System.out.println();

        scanner.close();
    }
}