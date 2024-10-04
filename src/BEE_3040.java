import java.util.Scanner;

/**
 * The Christmas Tree
 * 
 * Every year, Roberto likes to choose his Christmas tree, he doesn't let anyone choose for him, because he thinks the tree to be beautiful, must meet some conditions, such as height, thickness and number of branches, so he can hang many Christmas decorations on it.
 * Roberto wants his tree to be at least 200 centimeters tall, but he doesn't want it to be larger than 300 centimeters, or the tree won't fit in his house. As for thickness, he wants his tree to have a trunk that is 50 centimeters in diameter or more. The tree must be 150 branches or greater.
 * 
 * Input
 * 
 * The first line of input contains an integer N(0 < N ≤ 10000), the number of test cases. The next N lines contain 3 integers each, h, d and g(0 < a, d, g ≤ 5000), the height of the tree in centimeters, its diameter in centimeters, and the amount of tree branches.
 * 
 * Output
 * 
 * Your task is, for each tree, to print Sim, if it is a tree that Roberto can choose, or Nao, if it is a tree he should not choose.
 * 
 *  Input Sample	            Output Sample
 *   8                          Sim
 *                              Nao
 *   200 60 160                 Sim
 *                              Nao
 *   150 50 200                 Nao
 *                              Nao
 *   300 85 341                 Sim
 *                              Sim
 *   110 10 50
 *
 *   450 90 1141
 *
 *   270 40 340
 *
 *   262 51 432
 *
 *   203 60 200
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class BEE_3040 {

    public static void main(String[] args) {
        
        try (Scanner read = new Scanner(System.in)) {
            
            int testCases = read.nextInt();
         
            for (int i = 0; i < testCases; i++) {
                
                int height  = read.nextInt();
                int thickness = read.nextInt();
                int branches = read.nextInt();

                if((height >= 200 && height <= 300) && (thickness >= 50) && (branches >= 150)){
                    System.out.println("Sim");
                }else{
                    System.out.println("Nao");
                }

            }
                

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}