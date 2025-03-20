import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        scanner.close();

        int first = 0, second = 1;

        System.out.print(first); 

        while (second <= num) {
            System.out.print(" " + second);
            
            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println(); 
    }
}
