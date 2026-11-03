import java.util.Scanner;

public class IT26101292Lab6Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		double num,sqr,sqroot;
		
        System.out.print("Enter a number: ");
        num = input.nextDouble();

        sqr = num * num;
        sqroot = Math.sqrt(num);
		
		System.out.println();
        System.out.println("The square of " + num + " is : " + sqr);
        System.out.println("The square root of " + num + " is : " + sqroot);

    }
}
