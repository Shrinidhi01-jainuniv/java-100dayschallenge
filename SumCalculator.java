import java.util.Scanner;

public class SumCalculator {

    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = calculateSum(a, b);
        System.out.println(result);

        scanner.close();
    }
}
