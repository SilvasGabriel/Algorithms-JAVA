import java.util.Scanner;
import java.text.DecimalFormat;

/*
 *  Ages
 * 
 *  Write an algorithm to read an undeterminated number of data, each containing an individual's age. The final data, which will not enter in the calculations, contains the value of a negative age. 
 *  Calculate and print the average age of this group of individuals.
 * 
 *  Input
 *  The input contains an undetermined number of integers. The input will be stop when a negative value is read.
 *
 *  Output
 *  The output contains a value corresponding to the average age of individuals.
 *
 *  The average should be printed with two digits after the decimal point. 
 * 
 *  Input Sample	        Output Sample
 *      34                      39.25
 *      56
 *      44
 *      23
 *      -2
 * 
 */


public class BEE_1154 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)){

            DecimalFormat formatNumber = new DecimalFormat("0.00");
            double soma = 0;
            double count  = 0;
            while (true) {
                double number = read.nextInt();
                if(number < 0){
                    break;
                }
                count++;
                soma = soma + number;
            }
            System.out.println(formatNumber.format(soma/count));
        
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}