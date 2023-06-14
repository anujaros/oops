import java.util.Scanner;

public class Program13 {
    static double calculateArea(double side1, double side2, double side3) {
        double semiperimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - side1) * (semiperimeter - side2) * (semiperimeter - side3));
    }

    static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    static double calculateArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape:");
        System.out.println("1. Triangle");
        System.out.println("2. Circle");
        System.out.println("3. Rectangle");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        double area = 0.0;

        switch (choice) {
            case 1:
                System.out.print("Enter the length of side 1: ");
                double side1 = scanner.nextDouble();

                System.out.print("Enter the length of side 2: ");
                double side2 = scanner.nextDouble();

                System.out.print("Enter the length of side 3: ");
                double side3 = scanner.nextDouble();

                area = calculateArea(side1, side2, side3);
                System.out.println("The area of the triangle is: " + area);
                break;
            case 2:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                area = calculateArea(radius);
                break;
            case 3:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                area = calculateArea(length, width);
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("The area is: " + area);
    }
}
