import java.util.Scanner;

public class BinomialCoefficient {

    public static int calculateBinomialCoefficient(int n, int k) {
        
        if (k > n - k)
            k = n - k;

        int result = 1;

        for (int i = 0; i < k; i++) {
            result = result * (n - i);
            result = result / (i + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int result = calculateBinomialCoefficient(n, k);
        System.out.println(result);

        scanner.close();
    }
}
