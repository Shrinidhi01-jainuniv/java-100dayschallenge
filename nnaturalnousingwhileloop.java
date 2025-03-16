import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        
        int sum = 0;
        int counter = 1;
        
        while (counter <= N) {
            sum += counter;
            counter++;
        }
        
        System.out.println(sum);
        
        scanner.close();
    }
}
