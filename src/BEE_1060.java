import java.util.Scanner;

/*
 * POSITIVE VALUES
 *
 * Make a program that reads 6 values. These values ​​will only be negative or positive (disregard null values). 
 * Next, show the number of positive values ​​entered.
 * 
 * INPUT
 * Six values, negative and/or positive.
 * 
 */

public class BEE_1060 {

    public static void main(String[] args) {
        
        try (Scanner read = new Scanner(System.in)){
          
            double [] values = new double[6];
            int contador = 0;

          for (int i = 0; i < values.length; i++) {
                values[i] = read.nextDouble();
                if(values[i] > 0){
                   contador = contador + 1;
                }
            }

           System.out.println(contador +" valores positivos");
        }

    }

}