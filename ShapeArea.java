import java.util.Scanner;

class AreaCalculator {
    
    // Method to calculate area of a circle (πr^2)
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    // Method to calculate area of a rectangle (length * width)
    double calculateArea(double length, double width) {
        return length * width;
    }
    
    // Method to calculate area of a trapezoid (0.5 * base * height)
    double calculateArea(double base1, double base2, double height) {
        return 0.5 * (base1 + base2) * height;
    }
}

public class ShapeArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AreaCalculator areaCalc = new AreaCalculator();
        boolean continueProgram = true;
        
        // Continue running the program as long as user wants
        while (continueProgram) {
            // Prompt user to choose a shape
            System.out.println("Choose a shape to calculate the area:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Trapezoid");
            System.out.print("Enter your choice (1/2/3): ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1: // Circle
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    double circleArea = areaCalc.calculateArea(radius);
                    System.out.println("Area of the circle: " + circleArea);
                    break;
                
                case 2: // Rectangle
                    System.out.print("Enter the length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    double rectangleArea = areaCalc.calculateArea(length, width);
                    System.out.println("Area of the rectangle: " + rectangleArea);
                    break;
                
                case 3: // Trapezoid
                    System.out.print("Enter the base1 of the trapezoid: ");
                    double base1 = scanner.nextDouble();
                    System.out.print("Enter the base2 of the trapezoid: ");
                    double base2 = scanner.nextDouble();
                    System.out.print("Enter the height of the trapezoid: ");
                    double height = scanner.nextDouble();
                    double trapezoidArea = areaCalc.calculateArea(base1, base2, height);
                    System.out.println("Area of the trapezoid: " + trapezoidArea);
                    break;
                
                default:
                    System.out.println("Invalid choice. Please select a valid shape.");
                    break;
            }
            
            // Ask if the user wants to continue
            System.out.print("Do you want to calculate another area? (yes/no): ");
            String continueChoice = scanner.next();
            if (continueChoice.equalsIgnoreCase("no")) {
                continueProgram = false; // Exit the loop
            }
        }
        
        System.out.println("Thank you for using the Shape Area Calculator!");
        scanner.close();
    }
}

