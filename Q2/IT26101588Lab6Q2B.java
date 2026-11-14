import java.util.Scanner;

public class IT26101588Lab6Q2B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int count = 1;
        String numbers = "";

        System.out.println("Please enter 10 numbers:");

        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            number = sc.nextInt();

            numbers = numbers + number + " ";
            count++;
        }

        System.out.println("\nThe numbers you entered are:");
        System.out.println(numbers);
    }
}