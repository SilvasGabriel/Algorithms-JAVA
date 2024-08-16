import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Weighted Averages
 * 
 *  Read 1 integer value N, which represents the number of test cases that come next. Each test case consists of 3 real values, each with one decimal place. 
 *  Present the weighted average for each of these sets of 3 values, with the first value having a weight of 2, the second value having a weight of 3 and the third value having a weight of 5.
 * 
 *  Entry
 *  The input file contains an integer value N in the first line. 
 *  Each N line below contains a test case with three values ​​with one decimal place for each value.
 */

public class BEE_1079 {

    public static void main(String[] args) {
        
        try (Scanner read = new Scanner(System.in)){
 
            int N = read.nextInt();

            DecimalFormat decimalF = new DecimalFormat("0.0"); 

            for (int i = 0; i < N; i++) {
               
                double value1 = read.nextDouble();
                double value2 = read.nextDouble();
                double value3 = read.nextDouble();

                //Each value has one weight and you need to divide for the sum of the weights
                double result = ((value1 * 2) + (value2 * 3) + (value3 * 5))/10;

                System.out.println(decimalF.format(result));

            }

        }catch(Exception e){
            System.out.println("Error :" + e.getMessage());
        } 

    }
    
} 