import java.util.Scanner;

public class MaxElementFinder {

    public static int findMax(int[] arr) {
        int max = arr[0]; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] parts = input.split(",");
        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i].trim());
        }

        int max = findMax(arr);
        System.out.println(max);

        scanner.close();
    }
}
