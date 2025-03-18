import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        scanner.close();

        if (num <= 1) {
            
            System.out.println("Not Prime");
        } else {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; 
                }
            }
            if (isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }
}