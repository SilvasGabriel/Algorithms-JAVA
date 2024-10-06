import java.util.Scanner;

/**
 * Christmas Balls
 * 
 * Amelia loves Christmas, and her favorite part on this date is setting up the Christmas tree! She loves to decorate the tree with polka dots and colorful lights, so it looks bright and fun! However, Amélia likes things well distributed and demands that her tree has no more than half of branches in balls. So, if your Christmas tree has G branches, it needs G / 2 marbles. If the G number of branches is odd, that value will be rounded down.
 * This year, Amélia decided to update her tree and will buy a new one. Also, some of her balls broke, and she will need to know how many new balls she will need to buy to keep her tree balanced the way she likes it!
 * For that, she wants your help! Given the number of balls Amelia has and the number of branches her new tree will have, tell Amelia how many Christmas balls she needs to buy to decorate her new tree!
 * 
 * Input
 * 
 * The input consists of two integer values, read on two lines, B (1 < B < 103) and G (100 < G < 1000) indicating, respectively, the number of balls that Amélia already has and the number of branches of her new Christmas tree.
 * 
 * Output
 * 
 * Print the number of balls Amélia needs to buy to complete her tree, with the message "Faltam B bolinha(s)" (in English, Missing B ball(s)), where B is the number of balls that Amelia needs to buy. If Amelia has enough balls to spare, print the message "Amelia tem todas bolinhas!" (in English, "Amelia has all balls!")
 * 
 *  Input Sample                Output Sample
 * 
 *  300                         Faltam 50 bolinha(s)
 *  700
 * 
 *  300                         Amelia tem todas bolinhas!
 *  600
 * 
 *  300                         Faltam 50 bolinha(s)
 *  701
 * 
 */
public class BEE_3170 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            int numberOfBallsAlreadyHave = scanner.nextInt();
            int numberOfBranchesCT = scanner.nextInt();

            int discoverIfNeedMoreBalls = numberOfBranchesCT / 2;

            int howMuchNeed = discoverIfNeedMoreBalls - numberOfBallsAlreadyHave;

            if(howMuchNeed == 0){
                System.out.println("Amelia tem todas bolinhas!");
            }else{
                System.out.println("Faltam " + howMuchNeed + " bolinha(s)");
            }

        } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
        }
    }
}