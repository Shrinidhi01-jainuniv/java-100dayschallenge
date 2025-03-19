import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        scanner.close();

        int factorial = 1;

        int i = 1;
        do {
            factorial *= i;
            i++;
        } while (i <= num);

        System.out.println(factorial);
    }
}