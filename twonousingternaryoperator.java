import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read two decimal numbers as integers
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Calculate the maximum using the ternary operator
        int max = (a > b) ? a : b;

        // Output the result as an integer (no decimal)
        System.out.println(max);
    }
}
