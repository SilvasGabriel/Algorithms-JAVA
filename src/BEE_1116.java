import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Dividing X by Y
 * 
 *  Write an algorithm that reads 2 numbers and prints the result of dividing the first by the second. 
 *  If this is not possible, display the message “division impossible” for the values ​​in question.
 * 
 *  Entry
 *  The input contains an integer N. This N will be the number of pairs of integer values ​​(X and Y) that will be read next.
 *
 *  Exit
 *  For each case, show the result of the division with a digit after the decimal point, or “impossible division” if it is not possible to perform the calculation.
 *
 *  Note: Be careful that the division between two integers in some languages ​​such as C and C++ generates another integer. Use cast :)
 * 
 * 
 *  Input Example        Output Example
 *       3                    -1,5  
 *       3 -2            division impossible
 *      -8  0                  0,0
 *       0  8
 * 
 * 
 */

public class BEE_1116 {

    public static void main(String[] args) {
        
        try (Scanner read = new Scanner(System.in)) {
            
            //quantity of times the test will be applied
            int quantity_of_times = read.nextInt();
            DecimalFormat one_house = new DecimalFormat("0.0");
    
        //loop to test a amount of times
           for (int i = 0; i < quantity_of_times; i++) {
                
                //variables to check the both numbers
                double number1 = read.nextDouble();
                double number2 = read.nextDouble();

                //condition when the number2 is zero
                if(number2 == 0){
                    System.out.println("divisao impossivel");
                }

                System.out.println(one_house.format(number1/number2));

           }
    

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
    
}