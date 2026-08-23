import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        
        int length = password.length();
        
        if (length < 8) {
            System.out.println("Password is too short (less than 8 characters).");
        } else if (length >= 8 && length < 12) {
            System.out.println("Password length is acceptable.");
        } else {
            System.out.println("Password length is strong.");
        }
        
        scanner.close();
    }
}