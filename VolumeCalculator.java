import java.util.Scanner;

public class VolumeCalculator {

    public static double calculateVolume(double sideLength) {
        return sideLength * sideLength * sideLength;
    }

    public static double calculateVolume(double radius, String shapeType) {
        if ("sphere".equalsIgnoreCase(shapeType)) {
            return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        } else {
            throw new IllegalArgumentException("Unsupported shape type: " + shapeType);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sideLength = scanner.nextDouble();     
        double radius = scanner.nextDouble();          
        String shapeType = scanner.next();             

        double cubeVolume = calculateVolume(sideLength);
        double sphereVolume = calculateVolume(radius, shapeType);

        System.out.println(cubeVolume);
        System.out.println(sphereVolume);

        scanner.close();
    }
}
