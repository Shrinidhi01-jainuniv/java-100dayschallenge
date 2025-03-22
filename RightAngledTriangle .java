import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Read the input integer n (number of rows)
        int n = scanner.nextInt();
        
        // Loop through each row
        for (int i = 1; i <= n; i++) {
            // Print asterisks for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing a row
            System.out.println();
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
