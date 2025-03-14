import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double income = scanner.nextDouble();
        
        double tax = 0.0;

        if (income <= 250000) {
            tax = 0.0;
        } else if (income <= 500000) {
        
            tax = (income - 250000) * 0.05;
        } else if (income <= 1000000) {
            
            tax = (income - 500000) * 0.20 + 12500;
        } else {
            
            tax = (income - 1000000) * 0.30 + 112500;
        }

        System.out.printf("%.1f\n", tax);

        scanner.close();
    }
}