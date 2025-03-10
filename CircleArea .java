import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        double radius = scanner.nextDouble();

        double pi = 3.14;

        double area = pi * radius * radius;

        System.out.println(area);

        scanner.close();
    }
}