import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        float base = scanner.nextFloat();
        float height = scanner.nextFloat();

        float area = 0.5f * base * height;

        System.out.println(area);

        scanner.close();
    }
}
