import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Square Root of 2
 * 
 * The method of periodic continued fractions is one of the many ways to calculate the square root of a natural number. This method uses as denominator a repetition for fractions. This repetition can be done by a fixed number of times.
 * For example, by repeating 2 times the continued fraction to calculate the square root of 2, we have the following equation.
 * 
 *  sqrt(2) ≈ 1 + (1/2+1/2)
 * 
 * Your task is to calculate the approximate value of square root of 2 given the number N of repetitions.
 * 
 * Input
 * 
 * The input is a natural number N (0 ≤ N ≤ 100) that indicates the quantity of denominator repetitions in the continued fraction.
 * 
 * Output
 * 
 * The output is the approximate value of the square root with 10 decimal places.
 * 
 *  Input Samples	    Output Samples
 *      0                 1.0000000000
 *      1                 1.5000000000
 *      5                 1.4142857143
 * 
 * 
 */
public class BEE_2166 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            
            
            DecimalFormat tenhouses = new DecimalFormat("0.0000000000");
            int quantityOfReps = read.nextInt();
            if(quantityOfReps >= 0 && quantityOfReps <= 100){
                double N = 0.0;
                for (int i = 0; i < quantityOfReps; i++) {
                    N = N + 2.0;
                    N = 1.0/N ;    
                }
                N = N + 1;
                System.out.println(tenhouses.format(N));    
            }
            

        } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
        }
    }
}