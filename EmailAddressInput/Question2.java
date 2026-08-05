import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.println("Student Details");
        System.out.println("-----");
        System.out.println("Name : " + name);
        System.out.println("Email : " + email);

        scanner.close();
    }
}