import java.util.Scanner;

/*
 *  Divisors I
 * 
 *    Read an integer N and compute all its divisors.
 *
 *    Input
 *    The input file contains an integer value.
 *
 *    Output
 *    Write all positive divisors of N, one value per line.
 * 
 * 
 *      Input Sample	    Output Sample
 *          6                   1
 *                              2
 *                              3
 *                              6
 * 
 */

public class BEE_1157 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)){

            int number = read.nextInt();
           
            for (int i = 1; i <= number; i++) {
               if(number % i == 0){
                System.out.println(i);
               }
            }
         
        } catch (Exception e) {
            System.out.println("Error: " +  e.getMessage());
        }
    }
}