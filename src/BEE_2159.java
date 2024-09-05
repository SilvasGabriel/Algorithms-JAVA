import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Approximate Number of Primes
 * 
 * Schoenfeld and Rosser published a paper in 1962 describing a minimum and a maximum value to the quantity of prime numbers up to n, for n ≥ 17. This quantity is represented by the function (n) and the inequality is shown below.
 * 
 *  n/ln(n) < Pi(n) < 1.25506(n/ln(n))
 * 
 * Your task is, given a natural number n, to compute the interval's minimum and maximum values to the approximate number of primes up to n.
 * 
 * Input
 * 
 * The input is a natural number n (17 ≤ n ≤ 10^9).
 * 
 * Output
 * 
 * The output is given as two values P and M with 1 decimal place each, such that P < (n) < M according to the given inequality above. These two values have one blank space between them.
 * 
 * Input Samples    	Output Samples
 *      17                  6.0 7.5
 *      50                  12.8 16.0
 *      100                 21.7 27.3
 * 
 * 
 */
public class BEE_2159 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {

            DecimalFormat onehouse = new DecimalFormat("0.0");
        
            int number = read.nextInt();
            if(number >= 17){
                System.out.print(onehouse.format((number / Math.log(number)))+" "+onehouse.format((1.25506 * (number / Math.log(number)))));
            }

        } catch (Exception e) {
                System.out.println("Error : " + e.getMessage());
        }
    }
}