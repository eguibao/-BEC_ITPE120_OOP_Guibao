import java.util.Scanner;

public class ShapeCalculator {
    enum Shape {
        CIRCLE, SQUARE, TRIANGLE
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to choose a shape
        System.out.println("Choose a shape (CIRCLE, SQUARE, TRIANGLE):");
        String shapeInput = scanner.nextLine().toUpperCase();

        // Convert the user input to the corresponding Shape enum
        Shape selectedShape = Shape.valueOf(shapeInput);

        double[] dimensions;

        switch (selectedShape) {
            case CIRCLE:
                dimensions = new double[1];
                System.out.print("Enter the radius: ");
                dimensions[0] = scanner.nextDouble();
                break;
            case SQUARE:
                dimensions = new double[1];
                System.out.print("Enter the side length: ");
                dimensions[0] = scanner.nextDouble();
                break;
            case TRIANGLE:
                dimensions = new double[3];
                System.out.print("Enter side a: ");
                dimensions[0] = scanner.nextDouble();
                System.out.print("Enter side b: ");
                dimensions[1] = scanner.nextDouble();
                System.out.print("Enter side c: ");
                dimensions[2] = scanner.nextDouble();
                break;
            default:
                System.out.println("Invalid shape selection.");
                scanner.close();
                return;
        }

       
        System.out.println("Area: " + calculateArea(selectedShape, dimensions));
        System.out.println("Perimeter: " + calculatePerimeter(selectedShape, dimensions));

        scanner.close();
    }

    
    public static double calculateArea(Shape shape, double[] dimensions) {
        switch (shape) {
            case CIRCLE:
                double radius = dimensions[0];
                return Math.PI * radius * radius;
            case SQUARE:
                double side = dimensions[0];
                return side * side;
            case TRIANGLE:
                double a = dimensions[0];
                double b = dimensions[1];
                double c = dimensions[2];
                double s = (a + b + c) / 2.0; // Semi-perimeter
                return Math.sqrt(s * (s - a) * (s - b) * (s - c));
            default:
                return 0.0; 
        }
    }

    public static double calculatePerimeter(Shape shape, double[] dimensions) {
        switch (shape) {
            case CIRCLE:
                double radius = dimensions[0];
                return 2 * Math.PI * radius;
            case SQUARE:
                double side = dimensions[0];
                return 4 * side;
            case TRIANGLE:
                double a = dimensions[0];
                double b = dimensions[1];
                double c = dimensions[2];
                return a + b + c;
            default:
                return 0.0; 
        }
    }
}
