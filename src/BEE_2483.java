import java.util.Scanner;
/*
 * Merry Christmaaas!
 * 
 * You get so happy at Christmas that you want to scream at everyone: "Merry Christmas!!". To put all this happiness out, you wrote a program that, given an I index of happiness, your Christmas scream is more lively.
 * 
 * Input 
 * 
 * The input consists of an integer I (1 < I ≤ 104) that represents that happiness index.
 * 
 * Output
 * 
 * The output consists of the phrase "Feliz natal!" ("Merry Christmas" in Portuguese), and the last a of the sentence is repeated I times. A line break is necessary after printing the sentence.
 * 
 *  Input Sample     Output Sample
 *      5               Feliz nataaaaal!
 * 
 * 
 */
public class BEE_2483 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            
            int numberOfTimes= read.nextInt();
            
            String base = "Feliz nat";
            String bFinal = "l!";
            
            String repeat =  new String(new char[numberOfTimes]).replace("\0", "a");

            String result = base + repeat + bFinal;

            System.out.println(result);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}