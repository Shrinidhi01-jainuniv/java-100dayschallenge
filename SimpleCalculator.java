import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble();
        char operator = sc.next().charAt(0);
        double num2 = sc.nextDouble();

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;  
                }
                break;
            case '%':
                
                if (num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;  
                }
                break;
            default:
                System.out.println("Invalid operator.");
                return;  
        }

        
        System.out.println(result);
    }
}
