import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isPalindrome(int num) {
        
        if (num < 0) {
            return false;
        }

        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        boolean result = isPalindrome(num);

        System.out.println(result);

        scanner.close();
    }
}
