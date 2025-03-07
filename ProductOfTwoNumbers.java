import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        long product = (long) a * b;
        
        System.out.println(product);
        
        scanner.close();
    }
}
