import java.util.Scanner;

public class GCDCalculator {

    public static int calculateGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int gcd = calculateGCD(num1, num2);
        System.out.println(gcd);

        scanner.close();
    }
}
