import java.util.Scanner;

public class FloatToIntConversion {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        float num = scanner.nextFloat();

        int convertedNum = (int) num;

        System.out.println(convertedNum);

        scanner.close();
    }
}
