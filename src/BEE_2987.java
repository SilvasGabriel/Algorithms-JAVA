import java.util.Scanner;

/**
 * BEE_2987
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