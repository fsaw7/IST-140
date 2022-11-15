/*
 * Fatou Sawaneh
 * Average Calculator Lab
 * 9/21/21
 * fjs5286@psu.edu
 */
package averagecalculator;

/**
 * AverageCalculator.java
 * @author fatousawaneh 
 * The purpose is to calculate the average of three numbers
 */
import java.util.Scanner; 

public class AverageCalculator {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); // instantiate a new scanner object
        
        double x; // variables in place for the user to input numbers
        double y;
        double z;
        double AvgNum; // The average of all three numbers
        
        System.out.println("This program will calculate the average of three numbers.");
        System.out.print("Please enter a whole number for x: ");
        x = in.nextDouble();
        System.out.print("Please enter a whole number for y: ");
        y = in.nextDouble();
        System.out.print("Please enter a whole number for z: ");
        z = in.nextDouble();

        AvgNum = (x + y + z) / 3;

        System.out.printf("The average of the numbers " + "%.2f", x);
        System.out.printf(", " + "%.2f", y);
        System.out.printf(", and " + "%.2f", z);
        System.out.printf(" is" + " %.2f", AvgNum);

    }

}
