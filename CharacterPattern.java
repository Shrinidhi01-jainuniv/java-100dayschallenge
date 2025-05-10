import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n < 1 || n > 50) {
            System.out.println("Input must be between 1 and 50.");
            scanner.close();
            return;
        }

        for (int i = 1; i <= n; i++) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }

        scanner.close();
    }
}

