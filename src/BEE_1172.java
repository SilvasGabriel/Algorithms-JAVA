import java.util.Scanner;

/*
 * Array Replacement I
 * 
 *  Read an array X[10]. After, replace every null or negative number of X ​by 1. Print all numbers stored in the array X.
 *
 *  Input
 *  
 *  The input contains 10 integer numbers. These numbers ​​can be positive or negative.
 *
 *  Output
 *  
 *  For each position of the array, print "X [i] = x", where i is the position of the array and x is the number stored in that position.
 * 
 * 
 *   Input Sample       	Output Sample
 *      0                       X[0] = 1
 *     -5                       X[1] = 1
 *      63                      X[2] = 63
 *      0                       X[3] = 1
 *      ...                     ...
 * 
 */

public class BEE_1172 {

    public static void main(String[] args) {
        
        try (Scanner read = new Scanner(System.in)){
 
            int arrayN [] = new int[10];
            
            for (int i = 0; i < arrayN.length; i++) {
                arrayN[i] = read.nextInt();
                if(arrayN[i] <= 0){
                    arrayN[i] = 1;
                }
            }

            for (int i = 0; i < arrayN.length; i++) {
                System.out.println("x["+i+"] = " + arrayN[i]);
            }
            

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}