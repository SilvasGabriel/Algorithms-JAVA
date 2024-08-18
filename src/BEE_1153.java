import java.util.Scanner;

/*
 *  Simple Factorial
 * 
 *    Read a value N. Calculate and write its corresponding factorial. Factorial of N = N * (N-1) * (N-2) * (N-3) * ... * 1.
 *
 *    Input
 *    The input contains an integer value N (0 < N < 13).
 *
 *    Output
 *    The output contains an integer value corresponding to the factorial of N.
 * 
 *      
 *  Input Sample	Output Sample
 *      4                24
 * 
 * 
 * 
 */

public class BEE_1153 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)){

            int number = read.nextInt();
            int fatorial = 1;

            for (int i = 1; i <= number; i++) {
                fatorial = fatorial * i;
            }
            System.out.println(fatorial);
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}