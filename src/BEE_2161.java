import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Square Root of 10
 * 
 * The method of periodic continued fractions is one of the many ways to calculate the square root of a natural number. This method uses as denominator a repetition for fractions. This repetition can be done by a fixed number of times.
 * For example, by repeating 2 times the continued fraction to calculate the square root of 10, we have the following equation.
 * 
 *  sqrt(10) ≈ 3 + (1 / 6 + 1 / 6)
 * 
 * Your task is to calculate the approximate value of square root of 10 given the number N of repetitions.
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
 *      0                   3.0000000000
 *      1                   3.1666666667
 *      5                   3.1622776623
 * 
 */

public class BEE_2161 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
         
            DecimalFormat tenhouses = new DecimalFormat("0.0000000000");
            int quantityOfreps = read.nextInt();
            if(quantityOfreps >=0 && quantityOfreps <= 100){
                double N = 0.0;
                for (int i = 0; i < quantityOfreps; i++) {
                    N = N + 6.0;
                    N = (1.0 / N);
                }
                N = N + 3; 
                System.out.println(tenhouses.format(N));
            }



        } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
        }
    }
}