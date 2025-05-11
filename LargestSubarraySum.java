import java.util.Scanner;

public class LargestSubarraySum {

    public static int findLargestSubarraySum(int[] arr) {
        int maxSoFar = arr[0]; 
        int maxEndingHere = arr[0]; 

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]); 
            maxSoFar = Math.max(maxSoFar, maxEndingHere); 
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        String[] tokens = inputLine.split(",");
        int[] arr = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i].trim());
        }

        int result = findLargestSubarraySum(arr);
        System.out.println(result);

        scanner.close();
    }
}