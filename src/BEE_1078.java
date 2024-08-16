import java.util.Scanner;

/*
 * Multiplication Table
 * 
 *  Read 1 integer value N (2 < N < 1000). 
 *  Next, show the multiplication table for N: 1 x N = N 2 x N = 2N... 10 x N = 10N
 *
 *  Entry
 *  The input contains an integer value N (2 < N < 1000).
 * 
 */


public class BEE_1078 {

    public static void main(String[] args) {
        
        try (Scanner read = new Scanner(System.in)){

            int N = read.nextInt();

            for (int i = 1; i <= 10; i++) {
                int result = i * N;
                System.out.println(i + " x " + N + " = " + result);
            }
            
        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

    }
    
}