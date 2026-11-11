import java.util.Scanner;

public class IT26102610Lab6Q2B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int count = 1;

        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            int number = input.nextInt();

            System.out.println("Number: " + number);

            count++;
        }

        input.close();
    }
}