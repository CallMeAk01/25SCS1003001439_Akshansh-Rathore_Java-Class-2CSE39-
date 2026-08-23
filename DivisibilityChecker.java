import java.util.Scanner;

public class DivisibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to check: ");
        int num = scanner.nextInt();
        
        if (num % 5 == 0) {
            System.out.println(num + " is divisible by 5.");
            
            // Nested check for 10
            if (num % 10 == 0) {
                System.out.println(num + " is also divisible by 10.");
            } else {
                System.out.println(num + " is NOT divisible by 10.");
            }
        } else {
            System.out.println(num + " is NOT divisible by 5.");
        }
        
        scanner.close();
    }
}