import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Even and Odd
 * 
 * Considering the input of non-negative integer values​​, sort these numbers ​​according to the following criteria: First the even in ascending order followed by the odd in descending order.
 * 
 * Input
 * 
 * The first line of input contains a positive integer number N (1 < N <= 105). This is the number of following input lines. The next N lines contain, each one, a integer non-negative number.
 * 
 * Output
 * 
 * Print all numbers according to the explanation presented above. Each number must be printed in one line as shown below.
 * 
 * Sample Input         Sample Output
 *      10                  4
 *      4                   32
 *      32                  34
 *      34                  98
 *      543                 654
 *      3456                3456
 *      654                 6789
 *      567                 567
 *      87                  543
 *      6789                87
 *      98
 * 
 * 
 */
public class BEE_1259 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            
            ArrayList<Integer> odd = new ArrayList<>();
            ArrayList<Integer> even = new ArrayList<>();

            int quantityOfTries = read.nextInt();
          
            for (int i = 0; i < quantityOfTries; i++) {
                int numbers = read.nextInt();
                if(numbers % 2 == 0){
                    even.add(numbers);
                }else{
                    odd.add(numbers);
                }      
            }

            Collections.sort(even);
            Collections.sort(odd);
            Collections.reverse(odd);

            ArrayList<Integer> merged = new ArrayList<>();
            merged.addAll(even);
            merged.addAll(odd);

            System.out.println("\n");

            for (Integer values : merged) {
                System.out.println(values);
            }


        } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
        }
    }
}