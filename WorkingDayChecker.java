import java.util.Scanner;

public class WorkingDayChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a day number (1-7): ");
        int day = scanner.nextInt();
        
        if (day >= 1 && day <= 5) {
            System.out.println("It is a Working Day.");
        } else if (day == 6 || day == 7) {
            System.out.println("It is the Weekend!");
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }
        
        scanner.close();
    }
}