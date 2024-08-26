import java.util.Scanner;

/*
 *  Identifying Tea
 * 
 *   Blind tea tasting is the skill of identifying a tea by using only your senses of smell and taste.
 *
 *   As part of the Ideal Challenge of Pure-Tea Consumers (ICPC), a local TV show is organized. During the show, a full teapot is prepared and five contestants are handed a cup of tea each. The participants must smell, taste and assess the sample so as to identify the tea type, which can be: (1) white tea; (2) green tea; (3) black tea; or (4) herbal tea. At the end, the answers are checked to determine the number of correct guesses.
 *
 *   Given the actual tea type and the answers provided, determine the number of contestants who got the correct answer.
 *
 *   Input
 *   
 *   The first line contains an integer T representing the tea type (1 ≤ T ≤ 4). The second line contains five integers A, B, C, D and E, indicating the answer given by each contestant (1 ≤ A, B, C, D, E ≤ 4).
 *
 *   Output
 *   
 *   Output a line with an integer representing the number of contestants who got the correct answer.
 * 
 *  Input Samples	    Output Samples
 *      1                     2
 *      1 2 3 2 1
 * 
 *      3                     0
 *      4 1 1 2 1           
 * 
 * 
 * 
 */
public class BEE_2006 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {

         int typeOfTea = read.nextInt();
         int sum = 0;

         for (int i = 0; i <  5; i++) {
            int answerOfTea = read.nextInt();
            if(typeOfTea == answerOfTea){
                sum = sum + 1;
            }
        }

        System.out.println(sum);
            
        } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
        }
    }

}