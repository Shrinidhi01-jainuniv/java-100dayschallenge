import java.util.Scanner;

public class ArraySumCalculator {

    public static int findSum(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        String[] tokens = inputLine.split(",");
        int[] arr = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i].trim());
        }

        int totalSum = findSum(arr);
        System.out.println(totalSum);

        scanner.close();
    }
}
