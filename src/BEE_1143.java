import java.util.Scanner;

/*
 * Square and Cube
 * 
 * Write a program that reads an integer value N (1 < N < 1000). This N is the number of output lines that will be presented when executing the program.
 * 
 * Entry
 * The input file contains a positive integer N.
 * 
 * Exit
 * Print the output as per the given example.
 * 
 * Sample Input	        Sample Output
 *      5                   1 1 1
 *                          2 4 8
 *                          3 9 27
 *                          4 16 64                     
 *                          5 25 125
 * 
 */

public class BEE_1143 {

   public static void main(String[] args) {
    
        try (Scanner read = new Scanner(System.in)){
            
            int number = read.nextInt();
           
            for (int i = 1; i <= number; i++) {
                System.out.println(i+" "+i*i+" "+i*i*i);
            }   

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

   }
}