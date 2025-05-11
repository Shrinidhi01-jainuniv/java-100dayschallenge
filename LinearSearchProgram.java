import java.util.Scanner;

public class LinearSearchProgram {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String arrayInput = scanner.nextLine();
        String[] parts = arrayInput.split(",");
        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i].trim());
        }

        int target = scanner.nextInt();

        int index = linearSearch(arr, target);
        System.out.println(index);

        scanner.close();
    }
}
