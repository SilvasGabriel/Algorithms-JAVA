import java.util.Scanner;
import java.text.DecimalFormat;

/*
 *  MacPRONALTS
 * 
 *  The MacPRONALTS is with a super promotion, exclusive to the contestants of the first Selective MaratonaTEC. But they had a problem, all runners were trying to buy at the same time, so this generated a very long queue. The worst is that the cashier girl no have calculator or a program to help her to calculate more quickly. You are the person that will help the girl and the MacPRONALTS increase their sells. Bellow has a menu day, that contains the product number and its value.
 *
 *           1001 | R$ 1.50
 *
 *           1002 | R$ 2.50
 *
 *           1003 | R$ 3.50
 *
 *           1004 | R$ 4.50
 *
 *           1005 | R$ 5.50
 *
 *   Input
 *  
 *   The first entry is reported the number of purchased products (1 <= p <= 5). For each product follows the quantity (1 <= q <= 500) that the customer purchased.
 *
 *   Obs .: the product number will not be repeated.
 *
 *   Output
 *    
 *   You must print the purchase amount with two decimal places.
 * 
 *      Input Sample	    Output Sample
 *          2                  19.50
 *          1001 2
 *          1005 3
 * 
 *          1                  1750.00
 *          1003 500            
 * 
 *          5                  2808.50 
 *          1001 500             
 *          1005 300
 *          1003 23
 *          1002 52
 *          1004 44
 * 
 * 
 */
public class BEE_1985 {
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
        
            DecimalFormat twohouses = new DecimalFormat("0.00");
            int numberOfTests = read.nextInt();
            double soma1001 = 0;
            double soma1002 = 0;
            double soma1003 = 0;
            double soma1004 = 0;
            double soma1005 = 0;
            
            for (int i = 0; i < numberOfTests; i++) {
                int code = read.nextInt();
                int quantity = read.nextInt();

                if(code == 1001){
                    soma1001 = quantity * 1.50;                
                }else if(code == 1002){
                    soma1002 = quantity * 2.50;
                }else if(code == 1003){
                    soma1003 = quantity * 3.50;
                }else if(code == 1004){
                    soma1004 = quantity * 4.50;
                }else if(code == 1005){
                    soma1005 = quantity * 5.50;
                }else{
                    System.out.println("Type again a valid code.");
                }
            }

            double result = soma1001 + soma1002 + soma1003 + soma1004 + soma1005;

            System.out.println(twohouses.format(result));


        } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
        }
    }
}