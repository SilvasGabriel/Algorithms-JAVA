import java.util.Scanner;

/*
 * 
 * Fuel Type
 * 
 * A gas station wants to determine which of its products its customers prefer. 
 * Write an algorithm to read the type of fuel supplied (coded as follows: 1.Alcohol 2.Gasoline 3.Diesel 4.Fim).
 * If the user enters an invalid code (outside the range 1 to 4), a new code must be requested (until it is valid).
 * The program will end when the code entered is number 4.
 * 
 * Entry
 * The input contains only integer and positive values.
 * 
 * Exit
 * The message must be written: "THANK YOU VERY MUCH" and the number of customers who filled each type of fuel, as shown in the example.
 * 
 * Sample Input	        Sample Output
 *      8             THANK YOU VERY MUCH
 *      1                   Alcohol: 1
 *      7                   Gasoline: 2
 *      2                   Diesel: 0
 *      2
 *      4
 */

public class BEE_1134 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)){

            int alcohol = 0;
            int gasoline = 0;
            int diesel = 0;

            while (true) {

                int number = read.nextInt();

                if(number == 1){
                    alcohol = alcohol + 1;
                }else if(number == 2){
                    gasoline = gasoline + 1;
                }else if(number == 3){
                    diesel = diesel + 1;
                }else if(number == 4){
                    break;
                }
                
            }

            System.out.println("MUITO OBRIGADO");
            System.out.println("Alcool: " + alcohol);
            System.out.println("Gasolina: " + gasoline);
            System.out.println("Diesel: " + diesel);
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }       
    }
}