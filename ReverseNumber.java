import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int reversedNum = 0;

        int originalNum = num; 
        num = Math.abs(num); 

        for (; num != 0; num /= 10) {
            int digit = num % 10;  
            reversedNum = reversedNum * 10 + digit; 
        }

        if (originalNum < 0) {
            reversedNum = -reversedNum;
        }

        System.out.println(reversedNum);

        sc.close();
    }
}
