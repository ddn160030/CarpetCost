//UserInput

import java.util.Scanner;
import java.util.ArrayList;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<>(); // Create array list for shapes
        boolean continueProgram = true; //Loop
// Menu for user input
        while (continueProgram) {
            System.out.println("MENU - INSTALLATION CARPET COMPANY - DUSTIN NGUYEN");
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("Type a number from 1 to 6 to select a shape and 0 when you finish");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("4. Circle");
            System.out.println("5. Trapezoid");
            System.out.println("6. Parallelogram");
            System.out.println("0. DONE");
// Switch statements to collect user inputs
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Enter side of the square");
                    FA2024_Square_Nguyen square = new FA2024_Square_Nguyen();
                    square.setSide(scanner.nextDouble());
                    shapes.add(square);
                    break;
                case 2:
                    FA2024_Rectangle_Nguyen rectangle = new FA2024_Rectangle_Nguyen();
                    System.out.println("Enter length of the rectangle");
                    rectangle.setLength(scanner.nextDouble());
                    System.out.println("Enter width of the rectangle");
                    rectangle.setWidth(scanner.nextDouble());
                    shapes.add(rectangle);
                    break;
                case 3:
                    System.out.println("Enter base of the triangle");
                    FA2024_Triangle_Nguyen triangle = new FA2024_Triangle_Nguyen();
                    triangle.setBase(scanner.nextDouble());
                    System.out.println("Enter height of the triangle");
                    triangle.setHeight(scanner.nextDouble());
                    shapes.add(triangle);
                    break;
                case 4:
                    System.out.println("Enter radius of the circle");
                    FA2024_Circle_Nguyen circle = new FA2024_Circle_Nguyen();
                    circle.setSide(scanner.nextDouble());
                    shapes.add(circle);
                    break;
                case 5:
                    System.out.println("Enter Base 1 of the trapezoid");
                    FA2024_Trapezoid_Nguyen trapezoid = new FA2024_Trapezoid_Nguyen();
                    trapezoid.setBase(scanner.nextDouble());
                    System.out.println("Enter Base 2 of the trapezoid");
                    trapezoid.setSide(scanner.nextDouble());
                    System.out.println("Enter Height of the trapezoid");
                    trapezoid.setHeight(scanner.nextDouble());
                    shapes.add(trapezoid);
                    break;
                case 6:
                    System.out.println("Enter Base of the Parallelogram");
                    FA2024_Parallelogram_Nguyen parallelogram = new FA2024_Parallelogram_Nguyen();
                    parallelogram.setBase(scanner.nextDouble());
                    System.out.println("Enter Height of the Parallelogram");
                    parallelogram.setHeight(scanner.nextDouble());
                    shapes.add(parallelogram);
                    break;
                    // Terminates input menu and goes to main display
                case 0:
                    continueProgram = false;
                    new Display(shapes);
                    break;
            }

        }

            }
        }

