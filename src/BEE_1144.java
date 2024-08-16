import java.util.Scanner;

/*
 * Logical Sequence
 * 
 * Write a program that reads an integer value N. N * 2 lines of output will be presented when executing the program, following the logic of the example below. 
 * For values ​​with more than 6 digits, all digits must be presented.
 * 
 * Entry
 * O arquivo de entrada contém um número inteiro positivo N (1 < N < 1000).
 * 
 * Exit
 * Print the output as per the given example.
 * 
 * Sample Input	        Sample Output
 *      5                   1 1 1
 *                          1 2 2
 *                          2 4 8
 *                          2 5 9
 *                          3 9 27
 *                          3 10 28
 *                          4 16 64
 *                          4 17 65
 *                          5 25 125
 *                          5 26 126
 * 
 */

public class BEE_1144 {

    public static void main(String[] args) {
        
        try(Scanner read = new Scanner(System.in)){

            int number = read.nextInt();

            for (int i = 1; i <= number; i++) {
                System.out.println(i+" "+i*i+" "+""+i*i*i);
                System.out.println(i+" "+((i*i)+1)+" "+""+((i*i*i)+1));
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}