import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        
        if (num > 0) {
            System.out.print("The number is Positive ");
            if (num % 2 == 0) {
                System.out.println("and Even.");
            } else {
                System.out.println("and Odd.");
            }
        } else if (num < 0) {
            System.out.print("The number is Negative ");
            if (num % 2 == 0) {
                System.out.println("and Even.");
            } else {
                System.out.println("and Odd.");
            }
        } else {
            System.out.println("The number is Zero (Zero is technically an even number).");
        }
        
        scanner.close();
    }
}