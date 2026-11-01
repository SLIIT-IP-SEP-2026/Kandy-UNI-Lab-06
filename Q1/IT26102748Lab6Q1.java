//IT26102748 Mediwaka M.W.A.H.C.B.

import java.util.Scanner;

public class IT26102748Lab6Q1 {

    public static void main(String[] args) {

        double number, square, squareRoot;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextDouble();

        square = number * number;
        squareRoot = Math.sqrt(number);

        System.out.println("\nThe square of " + number + " is : " + square);
        System.out.println("The square root of " + number + " is : " + squareRoot);

        input.close();
    }
}
