import java.util.Scanner;

public class BinaryToDecimalConverter {

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();

        for (int i = 0; i < length; i++) {
            char digit = binary.charAt(length - 1 - i);

            if (digit == '1') {
                decimal += Math.pow(2, i);
            } else if (digit != '0') {
                
                throw new IllegalArgumentException("Invalid binary digit: " + digit);
            }
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String binary = scanner.nextLine();

        int result = binaryToDecimal(binary);
        System.out.println(result);

        scanner.close();
    }
}
