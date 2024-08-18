import java.util.Scanner;

/*
 *   Summing Consecutive Integers
 * 
 *   Write an algorithm to read a value A and a value N. Print the sum of N numbers from A (inclusive). While N is negative or ZERO, a new N (only N) must be read. All input values are in the same line.
 *
 *   Input
 *   The input contains only integer values, ​​can be positive or negative.
 *
 *   Output
 *   The output contains only an integer value.
 * 
 *  Input Sample	            Output Sample
 *      3 2                         7
 *      3 -1 0 -2 2                 7
 * 
 */

public class BEE_1149 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)){

            int sum = 0;
            int total = 0;
            
            int valueA = read.nextInt();

            while (valueA > 0) {

                int valueN = read.nextInt();

                if(valueN > 0){
                    
                    for (int i = 0; i < valueN; i++) {

                        sum = valueA + i;
                        System.out.println(valueA+" + "+i+" = "+sum );
                        total = total + sum;

                    }   
                    break;            
                }
         
            }

            System.out.println(total);

        
         

            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    
    }

}
