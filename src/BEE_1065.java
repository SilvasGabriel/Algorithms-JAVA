import java.util.Scanner;

/*
 * EVEN NUMBERS BETWEEN FIVE NUMBERS
 * 
 * Write a program that reads 5 integer values. 
 * Count how many of these entered values ​​are even and display this information.
 * 
 * INPUT
 * The input file contains any 5 integer values.
 * 
 */


public class BEE_1065 {

    public static void main(String[] args) {
        
        try(Scanner read = new Scanner(System.in)){

            int [] values = new int[5];
            int count = 0;

            for (int i = 0; i < values.length; i++) {
                
                values[i] = read.nextInt();
                if(values[i] % 2 == 0){
                    count = count + 1;
                }

            }

            System.out.println(count +" valores pares");

        }

    }

    
}