import java.util.Scanner;

public class AreaCalculatorr {

    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = scanner.nextDouble();  
        double width = scanner.nextDouble();   
        double radius = scanner.nextDouble();  

        double rectangleArea = calculateArea(length, width);
        double circleArea = calculateArea(radius);

        System.out.println(rectangleArea);
        System.out.println(circleArea);

        scanner.close();
    }
}
