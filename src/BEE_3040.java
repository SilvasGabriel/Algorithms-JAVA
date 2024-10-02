import java.util.Scanner;

/**
 * BEE_3040
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