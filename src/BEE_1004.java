import java.util.Scanner;

/*
 * SIMPLE PRODUCT
 * 
 * Read two integer values. 
 * Then calculate the product between these two values and assign this operation to the PROD variable. 
 * Then display the PROD variable with the corresponding message.
 * 
 * INPUT 
 * The input file contains 2 integer values.
 */

public class BEE_1004 {
    
    public static void main(String[] args) {
        
        try (Scanner read = new Scanner(System.in)) {
            int num1 = read.nextInt();
            int num2 = read.nextInt();
            int produto = num1 * num2;
            System.out.println("PROD = " + produto);
        }

    }

}
