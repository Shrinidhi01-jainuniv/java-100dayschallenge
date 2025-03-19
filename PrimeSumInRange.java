import java.util.Scanner;

public class PrimeSumInRange {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        scanner.close();

        int sum = 0;

        int num = start;
        do {

            if (isPrime(num)) {
                sum += num; 
            }
            num++;
        } while (num <= end);

        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}
