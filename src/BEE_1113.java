import java.util.Scanner;

/*
 *  Ascending and Descending
 * 
 *  Read an undetermined number of pairs of integer values. Write a message for each pair indicating if this two numbers are in ascending or descending order.
 *
 *  Input
 *  The input file contains several test cases. Each test case contains two integer numbers X and Y. The input will finished when X = Y.
 *
 *  Output
 *  For each test case print “Crescente”, if the values X and Y are in ascending order, otherwise print
 *
 * 
 *  Input Sample	   Output Sample
 *       5 4              Decrescente
 *       7 2              Decrescente
 *       3 8              Crescent
 *       2 2
 * 
 */

public class BEE_1113 {

    public static void main(String[] args) {
        
        try (Scanner read = new Scanner(System.in)){

            //Read two values in a loop if x is bigger than y one condition if the both values are equal other, and the rest the other one.
            while (true) {
                
                int X = read.nextInt();
                int Y = read.nextInt();

                if (X > Y) {
                    System.out.println("Decrescente");
                }else if (X == Y) {
                    System.out.println();
                }else{
                    System.out.println("Crescente");
                }

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}