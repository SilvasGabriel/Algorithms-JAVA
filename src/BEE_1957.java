import java.util.Scanner;

/*
 *  Converting to Hexadecimal
 *  
 *   Data stored in computers are in binary. An economic way of visualizing these numbers is the usage of base 16 (hexadecimal).
 *
 *   Your task is to write a program that, given a natural number at base 10, shows its representation in hexadecimal.
 *
 *   Input
 *  
 *   The input is a positive integer number V at base 10 (1 ≤ V ≤ 2 x 109).
 *
 *   Output
 *  
 *   The output is the same number V at base 16 in a single line (don't forget the end-of-line character). Use uppercase letters, as shown in the examples.
 *
 *   Input Samples	        Output Samples
 *       10                       A
 *       
 *       15                       F
 * 
 *       16                       10
 * 
 *       31                       1F
 * 
 *       65535                    FFFF
 * 
 * 
 */
public class BEE_1957 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {

            int number = read.nextInt();
            String value = Integer.toHexString(number);

            System.out.println(value.toUpperCase());
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}