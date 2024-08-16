import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * FUEL EXPENSE
 * 
 * Joaozinho wants to calculate and show the number of liters of fuel spent on a trip, when using a car that does 12 KM/L. To do this, he would like you to help him through a simple program. 
 * To carry out the calculation, you must provide the time spent on the trip (in hours) and the average speed during the trip (in km/h). Thus, you can obtain distance traveled and then calculate how many liters would be needed.
 * Show the value with 3 decimal places after the point.
 * 
 * INPUT
 * 
 * The file contains two integer values. 
 * The first is the time spent on the trip (in hours) 
 * And the second is the average speed during the trip (in km/h).
 * 
 */

public class BEE_1017 {

    public static void main(String[] args) {
        
       
        try (Scanner read = new Scanner(System.in)) {
            DecimalFormat three_houses = new DecimalFormat("0.000");
            int tempo = read.nextInt();
            int velocidade = read.nextInt();
            double qtde_litros = ((double)(tempo * velocidade)) / 12;

            System.err.println(three_houses.format(qtde_litros));
        }


    }
    
}