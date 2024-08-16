import java.util.Scanner;

/*
 * Pair Square
 * 
 * Read an integer value N. Present the square of each of the even values, from 1 to N, including N, if applicable.
 *
 * Entry
 *  The input contains an integer value N (5 < N < 2000).
 *
 * Exit
 *  Print the square of each of the even values, from 1 to N, as shown in the example below.
 * 
 */

public class BEE_1073 {

    public static void main(String[] args) {
        try(Scanner read = new Scanner(System.in)){


            int N = read.nextInt();

                for (int i = 1; i <= N; i++) {
                    
                    if(i % 2 == 0){
                       double result = Math.pow(i, 2);
                       System.out.println(i + " ^ 2 = " + (int)result);
   
                    }
                   
               }
             
        }
    }

}