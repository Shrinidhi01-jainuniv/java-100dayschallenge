import java.util.Scanner;

public class LargestOfTwoNumbers {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        
        if (a > b) {
        
            if (a == (int) a) {
                System.out.println((int) a);
            } else {
                System.out.println(a);
            }
        } else {
            
            if (b == (int) b) {
                System.out.println((int) b);
            } else {
                System.out.println(b);
            }
        }
        scanner.close();
    }
}