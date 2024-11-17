//Display

import java.util.ArrayList;

public class Display {
    // Display after user input
    public Display(ArrayList<Shape> shapes){
        double totalArea = 0;
        for (int i = 0; i < shapes.size(); i++){
            Shape shape = shapes.get(i);
            totalArea += shape.area(); // Totals area from ArrayList
        }
        System.out.println("INSTALLATION CARPET COMPANY - DUSTIN NGUYEN");
        System.out.println("-----------------------------------------------------------------");
        String format = "%-15s%37s%n";
        System.out.printf(format, "THE PROJECT ADDRESS:", "123 Walnut Road Dallas TX 75243");
        for (int i = 0; i < shapes.size(); i++){
            Shape shape = shapes.get(i);
            System.out.printf("%-30s%20.2f%n", shape.toString(), shape.area()); // Displays shape and area of said shape
        }
        System.out.println("-----------------------------------------------------------------");
        // Calculating cost variables
        double materialsCost = totalArea * 4.59;
        double labor = totalArea * 2.99;
        double subtotal = materialsCost + labor;
        double tax = subtotal * .0825;
        double total = subtotal + tax;
        // Outputs costs of each portion
        System.out.printf("%-15s%40.2f%n", "Sum of area (square feet)", totalArea);
        System.out.printf("%-15s%10.2f%n", "Carpet and other materials Cost ($4.59 per square foot)", materialsCost);
        System.out.printf("%-15s%37.2f%n", "Labor ($2.99 per square foot", labor);
        System.out.printf("%-15s%50.2f%n", "Subtotal", subtotal);
        System.out.printf("%-15s%50.2f%n", "Tax (8.25%)", tax);
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("%-15s%43.2f%n", "Total of the project: ", total);


    }
}
