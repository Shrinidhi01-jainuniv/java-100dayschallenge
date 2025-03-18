import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String inputStr = scanner.nextLine();

        scanner.close();

        String reversedStr = new StringBuilder(inputStr).reverse().toString();

        System.out.println(reversedStr);
    }
}
