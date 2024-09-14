import java.util.Scanner;

/**
 * Uncovering Monty Hall
 * 
 * On the stage of an auditorium program there are three closed doors: door 1, door 2 and door 3. Behind one of these doors there is a car, behind each of the other two doors there is a goat. The program's production team randomly selects the door where the car will be, without cheating.
 * Only the show's host knows where the car is. He asks the player to choose one of the doors. See that now, as there is only one car, behind at least one of the two doors that the player did not choose, there has to be a goat!
 * Therefore, the presenter can always do the following: between the two doors that the player did not choose, he opens one that has a goat on it, so that the player and spectators can see the goat. The presenter now asks the player: “do you want to exchange your door for the other door that is still closed?”. Is it advantageous to exchange or not? The player wants to keep the door with the car, of course!
 * Paulinho saw a rigorous demonstration that the probability of the car being behind the door that the player initially chose is 1/3 and the probability of the car being behind the other door, which is still closed and which the player did not initially choose, is 2/3 and therefore the exchange is advantageous. Paulinho doesn't accept it, his intuition tells him that it doesn't matter, that the probability is 1/2 for both doors still closed...
 * In this problem, to resolve Paulinho's doubts, we will simulate this game thousands of times and count how many times the player won the car. Let's assume that:
 * • The player always initially chooses door 1;
 * • The player always switches doors, after the presenter reveals a goat opening one of the two doors that were not initially chosen.
 * Under these conditions, in a game, given the number of the door containing the car, see that we can know exactly whether the player will win the car or not.
 * 
 * Input
 * 
 * The first line of the input contains an integer N (1 ≤ N ≤ 104), indicating the number of games in the simulation. Each of the following N lines contains an integer: 1, 2 or 3; representing the port number that contains the car in that game.
 * 
 * Output
 * 
 * Your program must produce a single line, containing an integer representing the number of times the player won the car in this simulation, assuming that he always initially chooses door 1 and always switches doors after the presenter reveals a goat opening one of the two ports that were not chosen initially.
 * 
 * Input Sample         Output Sample
 *      5                       3
 *      1
 *      3
 *      2
 *      2
 *      1
 * 
 *      1                        0
 *      1
 * 
 *      15                       10
 *      3
 *      2
 *      3
 *      1
 *      1
 *      3
 *      3
 *      2
 *      2
 *      1
 *      2
 *      3
 *      2
 *      1
 *      1
 * 
 * 
 */

public class BEE_2879 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            
            int quantityOfTrys = read.nextInt();
            int count = 0;

            for (int i = 0; i < quantityOfTrys; i++) {
                
                int door = read.nextInt();

                if (door == 2 || door == 3) {
                    count++;
                }

            }

            System.out.println(count);

        } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
        }
    }
}