import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int sum = a + b;
        
        System.out.println(sum);
        
        scanner.close();
    }
}
