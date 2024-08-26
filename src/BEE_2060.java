import java.util.Scanner;

/*
 *  Bino's Challenge
 * 
 *    Bino and Cino are close friends. Bino likes to create mathematical challenges to Cino. This time, Bino created a list of numbers and asked to Cino: How many numbers are multiples of 2, 3, 4 and 5?
 *
 *    This challenge looks simple, but when the list contains many numbers, Cino makes some miscalculations. To help Cino, make a program to solve the Bino's Challenge.
 *
 *    Input
 *    
 *    The first line of input consists of an integer N (1 ≤ N ≤1000), representing the amount of numbers in the Bino's list.
 *
 *    The second line contains N integers Li (1 ≤ Li ≤ 100), representing the numbers of the Bino's list.
 *
 *    Output
 *    
 *    Print the amount of multiples of 2, 3, 4 and 5 in the list. Note the formatting of the output in the output sample, because it must be followed strictly. "Multiplo(s)" means "Multiple(s)" in English, but you must print the message in Portuguese.
 * 
 *      Input Sample	        Output Sample
 *          5                       4 Multiplo(s) de 2
 *          2 5 4 20 10             0 Multiplo(s) de 3
 *                                  2 Multiplo(s) de 4
 *                                  3 Multiplo(s) de 5
 *       
 */
public class BEE_2060 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            
            int numberOfTests = read.nextInt();
            int somam2 = 0;
            int somam3 = 0;
            int somam4 = 0;
            int somam5 = 0;

            for (int i = 0; i < numberOfTests; i++) {
                
                int value = read.nextInt();

                if(value % 2 == 0){
                    somam2 = somam2 + 1;
                }

                if (value % 3 == 0) {
                    somam3 = somam3 + 1;
                }

                if (value % 4 == 0) {
                    somam4 = somam4 + 1;
                }

                if (value % 5 == 0) {
                    somam5 = somam5 + 1;
                }

            }

            System.out.println(somam2 + " Multiplo(s) de 2");
            System.out.println(somam3 + " Multiplo(s) de 3");
            System.out.println(somam4 + " Multiplo(s) de 4");
            System.out.println(somam5 + " Multiplo(s) de 5");

        } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
        }
    }
}