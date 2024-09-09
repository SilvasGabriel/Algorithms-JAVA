import java.util.Scanner;

/**
 * I am Toorg!
 * 
 * Toorg is the wisest member of the group of heroes called The Protectors of the Milky Way. For any question, it has the ideal answer! Write a program that, given a question, tells Toorg's answer.
 * 
 * Input
 * 
 * The input will have several test cases. For each test case, a N number is displayed, which represents the number of test cases. Then there will be N lines, with questions asked for Toorg.
 * 
 * Output
 * 
 * For each test case, print Toorg's answer.
 * 
 * Input Sample	                Output Sample
 *      3                           I am Toorg!
 *      Who are you?                I am Toorg!
 *      How old are you?            I am Toorg!
 *      What can I do for you?
 * 
 */
public class BEE_2581 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            
            int questionN = read.nextInt();

            for (int i = 0; i < questionN; i++) {

                read.nextLine();

                if (read.hasNextLine()) {
                    System.out.println("I am Toorg!");
                }

            }
        
            
        } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
        }
    }
}