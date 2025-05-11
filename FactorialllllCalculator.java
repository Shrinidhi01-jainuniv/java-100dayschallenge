public class FactorialllllCalculator {

    public static int calculateFactorial(int n) {
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int n = scanner.nextInt();
        int result = calculateFactorial(n);

        System.out.println(result);

        scanner.close();
    }
}
