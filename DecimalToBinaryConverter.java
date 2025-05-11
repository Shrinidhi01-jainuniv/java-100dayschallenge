import java.util.Scanner;

public class DecimalToBinaryConverter {

    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder); 
            decimal = decimal / 2;
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimal = scanner.nextInt();

        String binary = decimalToBinary(decimal);
        System.out.println(binary);

        scanner.close();
    }
}
