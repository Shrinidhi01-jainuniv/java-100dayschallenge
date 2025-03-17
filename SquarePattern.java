import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n >= 1 && n <= 20) {
 
            for (int i = 0; i < n; i++) {
               
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
                
                System.out.println();
            }
        } else {
            System.out.println("Input out of bounds.");
        }

        sc.close();
    }
}
