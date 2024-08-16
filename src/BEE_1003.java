import java.util.Scanner; 

/* 
    SUM OF TWO VALUES 
 * 
 *  Read two integer values, in this case for variables A and B.   
 *  Then, calculate the sum between them and assign it to the variable SUM.    
 *  Then write the value of this variable.
 * 
 *  INPUT
 *  The input file contains 2 integer values.
*/

public class BEE_1003{

    public static void main(String[] args) {

        try (Scanner read = new Scanner(System.in)) {
            int num1 = read.nextInt();
            int num2 = read.nextInt(); 
            int soma = num1 + num2;
            System.out.println("SOMA = " + soma);
        }
        
    }

    
}