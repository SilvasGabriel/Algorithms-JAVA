import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * BEE_2950
 */
public class BEE_2950 {

    public static void main(String[] args) {
        
        try(Scanner read = new Scanner(System.in)) {
         
         DecimalFormat twoHouse = new DecimalFormat("0.00");   

         double distanceOfTower = read.nextDouble();
         double diameterTowerOne = read.nextDouble();
         double diameterTowerTwo = read.nextDouble();
         
         double ICM = distanceOfTower / (diameterTowerOne + diameterTowerTwo);

         System.out.println(twoHouse.format(ICM));


        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}