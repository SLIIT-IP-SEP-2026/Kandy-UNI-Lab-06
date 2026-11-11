import java.util.Scanner;

public class IT26101588Lab6Q2C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int count = 1;
        int sum = 0;
        String numbers = "";

        System.out.println("Please enter 10 numbers:");

        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            number = sc.nextInt();

            numbers = numbers + number + " ";
            sum = sum + number;

            count++;
        }

        double average = sum / 10.0;

        System.out.println("\nThe numbers you entered are:");
        System.out.println(numbers);

        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
    }
}