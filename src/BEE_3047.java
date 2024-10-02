import java.util.Scanner;

/**
 * BEE_3047
 */
public class BEE_3047 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            
            int donaMonicaAge = read.nextInt();
            int firstChild = read.nextInt();
            int secondChild = read.nextInt();
            
            int thirdChild = donaMonicaAge - (firstChild + secondChild);
            
            if(firstChild > secondChild && firstChild > thirdChild){
                System.out.println(firstChild);
            }

            if(secondChild > firstChild && secondChild > thirdChild){
                System.out.println(secondChild);
            }

            if(thirdChild > firstChild && thirdChild > secondChild){
                System.out.println(thirdChild);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}