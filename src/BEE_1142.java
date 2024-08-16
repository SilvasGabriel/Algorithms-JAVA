import java.util.Scanner;

/*
 * PUM
 * 
 * Write a program that reads an integer value N. This N is the number of lines of output that will be presented when executing the program.
 * 
 * Entry
 * The input file contains a positive integer N.
 * 
 * Exit
 * Print the output as per the given example.
 * 
 * Sample Input	        Sample Output
 *     7                    1 2 3 PUM
 *                          5 6 7 PUM
 *                          9 10 11 PUM                             
 *                          13 14 15 PUM
 *                          17 18 19 PUM
 *                          21 22 23 PUM
 *                          25 26 27 PUM
 * 
 * 
 */

public class BEE_1142 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)){
            
            int number = read.nextInt();

            //Start the number here
            int start = 1;

            for (int i = 1; i <=  number; i++) {
                System.out.println(start +" "+ (start + 1)+" "+ (start + 2)+" PUM");
                start = start + 4;
            }
          
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}