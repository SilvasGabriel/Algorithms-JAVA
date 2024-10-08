import java.util.Scanner;

/**
 * Bean
 * 
 * It is said in the surroundings of Montes Claros that, long ago in the municipal market, Sebastião and his companions of work always play a game of divination after the delivery of agricultural products harvested in the week that happened. The game, "Guess Where the Bean is", consists in hiding a grain of beans in one of four opaque glasses, and after shuffling them, the bettor must guess in which glass the vegetable is.
 * This year, due to the great cultural and historical success and the enormous amount of people who practice this game in the municipal market, the city council decided to hold a "Guess Where the Bean is '' championship. 
 * However, she needs a program to show viewers where the beans were after the end of a game. Knowing that the next Programming Marathon will take place in the city, she soon commissioned a solution from the excellent programmers. 
 * In this way, you should assist the organization in this mission with a program that will inform, at the end of a match, where the beans were.
 * 
 * Input
 * 
 * The entry will contain only one line with four integers, C1, C2, C3 and C4 separated by a space. The value Ci = 1 indicates that the beans were in cup number i, and Ci = 0 indicates that the ith cup was empty at the end of the game. There will always be exactly one glass with the beans.
 * 
 * Output
 * 
 * Write in the output a line containing an integer between 1 and 4, corresponding to the position where the beans were.
 * 
 * Input Samples	        Output Samples
 *      0 0 0 1                 4
 *      
 *      0 1 0 0                 2
 * 
 *      0 0 1 0                 3
 * 
 */

public class BEE_2791 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            
            int i = 0;
            int storeIndex = 0;
            while (i < 4) {
                i++;
                int bean = read.nextInt();
                int index = i ;
                
                if(bean == 1){
                    storeIndex = storeIndex + index;
                }
            }
            
            System.out.println(storeIndex);


        } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
        }
    }
}