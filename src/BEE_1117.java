import java.util.Scanner;

/*
 * Grade Validation
 * 
 *  Create a program that reads the notes for a student's two assessments. Calculate and print the semiannual average. Make the algorithm only accept valid grades (a valid grade must belong to the range [0,10]). 
 *  Each note must be validated separately.
 * 
 *  Entry
 *  The input contains multiple real values, positive or negative. The program must be terminated when two valid notes have been read.
 * 
 *  Exit
 *  If an invalid note is read, the message "invalid note" must be printed.
 *  When two valid notes are read, the message "average = " must be printed followed by the calculation value. The value must be presented with two places after the decimal point.
 * 
 * 
 *  Input Example        Output Example
 *      -3,5               invalid note
 *       3,5               invalid note
 *       11,0              average = 6,75
 *       10,0
 * 
 * 
 */

public class BEE_1117 {
    
    public static void main(String[] args) {
        
        try(Scanner read = new Scanner(System.in)){

            double nota1 = -1;
            double nota2 = -1;

            while (nota1 < 0 || nota1 > 10) {
                nota1 = read.nextDouble();
                if(nota1 < 0 || nota1 > 10){
                    System.out.println("nota invalida");
                }
            }

            while (nota2 < 0 || nota2 > 10) {
                nota2 = read.nextDouble();
                if(nota2 < 0 || nota2 > 10){
                    System.out.println("nota invalida");
                }
            }

            double media = (nota1 + nota2)/2;
            System.out.println("media = " + media);

        }catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}

    

        

    
