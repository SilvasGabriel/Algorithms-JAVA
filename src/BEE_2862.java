import java.util.Scanner;

/**
 * Insect!
 * 
 * Devita is the prince of the Calsadins. Together with Pana, they go after Tataroko, the birth name of Kogu, to try to dominate the world. 
 * It has a tracker that measures the energy level of any living being. All beings with the level less than or equal to 8000, it considers as if it were an insect ("Inseto"). 
 * When he passes this value, which was the case of Kogu, he is astonished and shouts "Mais de 8000", that means "It's over 8000". Based on this, use the same technology and analyze the energy level of living things.
 * 
 * Input
 * 
 * The input is composed of several test cases. The first line contains an integer C relative to the number of test cases. Then there will be C rows, with an integer N (100 <= N <= 100000) relative to the energy level of a living being.
 * 
 * Output
 * 
 * For each value read, print the corresponding text.
 * 
 * Input Sample	        Output Sample
 *      3                   Mais de 8000!
 *      8001                Inseto!
 *      100                 Inseto!
 *      200
 * 
 * 
 */

public class BEE_2862 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            
            int quantityOfTrys = read.nextInt();
            
            for (int i = 0; i < quantityOfTrys; i++) {
                
                int vegita = read.nextInt();
                
                if(vegita >= 8000){
                    System.out.println("Mais de 8000!");
                }else{
                    System.out.println("Inseto!");
                }  

            }

        } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
        }
    }
}