import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        
        if (n < 1 || n > 50) {
            System.out.println("Input must be between 1 and 50.");
            scanner.close();
            return;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        scanner.close();
    }
}
