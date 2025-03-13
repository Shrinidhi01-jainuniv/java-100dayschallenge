import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        
        double largest = a; 
        
        if (b > largest) {
            largest = b;
        }
        
        if (c > largest) {
            largest = c;
        }
        
        if (largest == (int) largest) {
            System.out.println((int) largest); 
        } else {
            System.out.println(largest); 
        }
        
        scanner.close();
    }
}