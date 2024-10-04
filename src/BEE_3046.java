import java.util.Scanner;

/**
 * Dominó
 * 
 * The traditional domino game, known as double-6, has 28 pieces. Each piece is divided into two squares and within each square there are between 0 and 6 circles. The game is called double-6 precisely because this is the largest number of circles that appears in a square of a piece. The figure to the side shows a way to organize the 28 pieces of the double-6 game into 7 lines. This figure allows you to clearly see how many pieces there would be in a game of dominoes, for example, of the double-4 type: they would be all the pieces from the first 5 lines, 15 pieces in total. We could also see, following the pattern in the figure, how many pieces the domino game known as Mexican has, which is double-12. 
 * There would be 91 pieces, corresponding to 13 lines. Luckily for us, there is a formula with which we can easily calculate the number of pieces in a double-N type game, for any natural number N: ((N+1)*(N+2))/2. In this problem, we need your help to write a program that, given the value N, uses this formula to calculate and print how many pieces there are in a double-N domino game.
 * 
 * Input
 * 
 * The first line of the input contains a natural number N representing the type of dominoes game: double-N.
 * 
 * Output
 * 
 * Your program must print a line containing a natural number representing how many pieces there are in a double-N domino game.
 * 
 * Input Sample         Output Sample
 *      6                   28
 * 
 *      12                  91
 * 
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