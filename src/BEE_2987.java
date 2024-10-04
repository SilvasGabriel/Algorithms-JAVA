import java.util.Scanner;

/**
 * Balloon of Honor
 * 
 * Given a letter of the alphabet, state its position.
 * 
 * Input
 * 
 * A single character L, an uppercase letter ('A' - 'Z') of the alphabet.
 * 
 * Output
 * 
 * A single integer, which represents the position of the letter in the alphabet.
 * 
 * 
 *  Input Sample	    Output Sample
 *      C                   3
 * 
 */
public class BEE_2987 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            
           String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

           char letter = read.next().charAt(0);

           int pos = alphabet.indexOf(letter);

           System.out.println(pos + 1);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}