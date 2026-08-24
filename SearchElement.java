import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the element you want to search for: ");
        int target = scanner.nextInt();
        
        boolean found = false;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println("Element " + target + " found at index " + i + " (Position " + (i + 1) + ").");
                found = true;
                break; // Exit the loop once found
            }
        }
        
        if (!found) {
            System.out.println("Element " + target + " was not found in the array.");
        }
        
        scanner.close();
    }
}