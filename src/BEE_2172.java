import java.util.Scanner;
/*
 * Event
 * 
 * Prog and Cackto recently started to play a role-playing game called Fortress. In this game, for player's evolve their level they need to defeat monsters, which gives a value of experience (XP) for player.
 * 
 * The producer of the game, Extreme Games, announced that next week will hold the first XP event of this game in which will increase monsters experience in an X value. As Prog and Cackto are at a very high level at which the monsters have a very high amount of experience points, they are having difficulties in calculating the amount of experience points that the monsters will have during the event. You can help them?
 * 
 * Input
 * 
 * There will be several test cases. Each test case contains two values: X (0 < X ≤ 3) indicating the increase in value of EXP from monsters and M (10 ≤ M ≤ 232-1) indicating the EXP value of the monster. The entry ends with values X == 0 and M == 0, in which should not be processed.
 * 
 * Output
 * 
 * For each case, your program should show a value E, value of new Monster EXP.
 * 
 *  Input Sample	    Output Sample
 *      1 544768710         544768710
 *      2 538533133         1077066266
 *      3 38884958          116654874
 *      0 0
 */
public class BEE_2172 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            
            while (true) {
               int X = read.nextInt();
               int M = read.nextInt();
               if(X == 0 && M ==0){
                    break;
               }
               System.out.println(X * M);
            }
                

        } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
        }        
    }

}