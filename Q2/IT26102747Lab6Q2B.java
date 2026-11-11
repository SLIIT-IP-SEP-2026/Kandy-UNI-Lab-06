
import java.util.Scanner;

public class IT26102747Lab6Q2B {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i = 1;

        while (i <= 10) {

            System.out.print("Enter number " + i + ": ");
            int num = input.nextInt();

            System.out.println("Number = " + num);

            i++;
        }
    }
}
