import java.util.*;

public class PairFinder {

    public static List<List<Integer>> findPairsWithSum(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int num : arr) {
            int complement = target - num;

            if (seen.contains(complement)) {
                
                result.add(Arrays.asList(complement, num));
            }

            seen.add(num);
        }

        Collections.sort(result, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> a, List<Integer> b) {
                return Integer.compare(a.get(0), b.get(0));
            }
        });

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        String[] tokens = inputLine.split(",");
        int[] arr = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i].trim());
        }

        int target = scanner.nextInt();

        List<List<Integer>> pairs = findPairsWithSum(arr, target);
        System.out.println(pairs);

        scanner.close();
    }
}
