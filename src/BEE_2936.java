import java.util.Scanner;

/**
 *  BEE_2936
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *  
 *   1 - >  res = 0 + 5 * portions[0];  == 1500  
 *   2 - >  res = 1500 + 4 * portions[1]; ==  7500
 *   3 - >  res = 7500 + 3 * portions[2]; ==  9300
 *   4 - >  res = 9300 + 2 * portions[3]; ==  11300
 *   5 - >  res = 11300 + 1 * portions[4]; ==  11450 - > add donaChica 225
 *
 *   1 - >  res = 0 + 1 * portions[0];  == 300  
 *   2 - >  res = 300 + 1 * portions[1]; ==  1800
 *   3 - >  res = 1800 + 1 * portions[2]; == 2400 
 *   4 - >  res = 2400 + 1 * portions[3]; == 3400 
 *   5 - >  res = 3400 + 1 * portions[4]; == 3550 - > add donaChica 225
 * 
 */
public class BEE_2936 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            

            int result = 0;

            int [] portions = {300, 1500, 600, 1000, 150};

            //Everyone eats just distribute the quantity os servings and they are separetade
            //_in order for example the first input is the servings of the number 1 the curupira.  

            for (int i = 0; i < 5; i++) {
                int servings = read.nextInt();
                
               result = result + servings * portions[i];

            }

            result = result + 225;

            System.out.println(result);

        
        } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
        }
    }
}
