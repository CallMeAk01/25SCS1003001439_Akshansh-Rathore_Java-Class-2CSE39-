import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time (Years): ");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest = " + simpleInterest);

        scanner.close();
    }
}