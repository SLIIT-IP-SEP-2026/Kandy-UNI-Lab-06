import java.util.Scanner;

public class IT26102709Lab6Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (0 or greater): ");
        double number = input.nextDouble();
        while (number < 0) {
            System.out.print("Please enter a non-negative number: ");
            number = input.nextDouble();
        }
        System.out.println("Square: " + (number * number));
        System.out.println("Square root: " + Math.sqrt(number));
        input.close();
    }
}
