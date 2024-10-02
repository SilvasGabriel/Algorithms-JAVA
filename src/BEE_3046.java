import java.util.Scanner;

/**
 * BEE_3046
 */
public class BEE_3046 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            
            int numberOfType = read.nextInt();

            int dominoFormula = ((numberOfType + 1) * (numberOfType + 2))/2;

            System.out.println(dominoFormula);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}