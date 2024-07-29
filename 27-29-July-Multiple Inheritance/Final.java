import java.util.Scanner;

interface Shape {
    double area();
}

final class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

final class Sphere implements Shape {
    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 4 * Math.PI * radius * radius;
    }
}

public class Final{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of Circle: ");
        double circleRadius = scanner.nextDouble();
        Circle circle = new Circle(circleRadius);
        System.out.println("Area of Circle: " + circle.area());

        System.out.print("Enter radius of Sphere: ");
        double sphereRadius = scanner.nextDouble();
        Sphere sphere = new Sphere(sphereRadius);
        System.out.println("Area of Sphere: " + sphere.area());
    }
}