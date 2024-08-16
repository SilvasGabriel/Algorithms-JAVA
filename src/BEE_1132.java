import java.util.Scanner;

/*
 * Multiples of 13
 * 
 * Write an algorithm that reads 2 integer values ​​X and Y and calculates the sum of the numbers that are not multiples of 13 between X and Y, including both.
 * 
 * 
 * Entry
 * The input file contains any 2 integer values, not necessarily in ascending order.
 * 
 * Exit
 * Print the sum of all values ​​not divisible by 13 between the two values ​​read from the input, including both if applicable.
 * 
 * Sample Input	        Sample Output
 *     100                  13954
 *     200
 * 
 */

public class BEE_1132 {

    public static void main(String[] args) {
        
        try(Scanner read = new Scanner(System.in)){

            int number1 = read.nextInt();
            int soma1 = 0;
            int number2 = read.nextInt();

            for (int i = number1; i <= number2 ; i++) {
               if(i % 13 != 0){
                  soma1 = soma1 + i;
               }
            }

            System.out.println(soma1);

            

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }

}