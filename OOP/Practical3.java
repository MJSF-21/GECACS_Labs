import java.util.Scanner;

public class Practical3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int n3 = scanner.nextInt();

        // Check if any two numbers have the same last digit
        if ((n1 % 10 == n2 % 10) || (n1 % 10 == n3 % 10) || (n2 % 10 == n3 % 10)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        scanner.close();
    }
}