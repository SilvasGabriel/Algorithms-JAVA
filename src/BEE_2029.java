import java.util.Scanner;
import java.text.DecimalFormat;

/*
 *  Honey Reservoir
 * 
 *  Julius is the owner of a large apiry situated in Paraíba. Every year, every six months, Julius collect honey produced by bees of their property and stores it in a CYLINDRICAL container format that facilitates the transport of honey for establishments who order this natural product for commercialization . Once Julio realized due to an increase in honey production, over the previous six months, the container that owned the stand the volume of honey produced by his bees. Julius needs now that you make a program that informs the volume of honey in cm3 and the diameter of the inside of the container in cm, calculate and show:
 * 
 *  - What should be the height (in cm) of Inside the container;
 *
 *  - The area (in cm2) of the mouth (entrance) of the container.
 *
 *  NB .: Consider π = 3.14
 * 
 *  Input
 *
 *  The input contains several test cases and ends with EOF. Each test case consists of a line containing two floating-point values of double precision with two decimals after comma, one V (1.00 ≤ V ≤ 10000.00) and one D (1.00 ≤ D ≤ 100.00), respectively representing the volume and the container diameter.
 *
 *  Output
 *
 *  For each test, the output contains the first line "ALTURA = " message, with a space after ALTURA and another after the symbol of equality, followed by the container height value with two decimals after comma and the second line message "AREA = ", also with a space after AREA and another after the symbol of equality, followed by the value of the area of the mouth (entrance) of the container with two decimals after comma.
 *
 *  - Do not forget the line break at the end of the exit, otherwise you will get "Presentation Error".
 * 
 *      Input Sample	    Output Sample
 *        1450.00            ALTURA = 2.96
 *        25.00              AREA = 490.62
 *        760.00             ALTURA = 0.61
 *        40.00              AREA = 1256.00
 *        7500.00            ALTURA = 42.46
 *        15.00              AREA = 176.62
 * 
 */

 public class BEE_2029 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {

            while (read.hasNext()) {

                if(!read.hasNextDouble()){
                    read.next();
                    break;
                }         
                DecimalFormat twoHouses = new DecimalFormat("0.00");
                double volume = read.nextDouble();
                double diameter = read.nextDouble();
                double radius = diameter/2;
                double height = volume / (3.14 * (Math.pow(radius, 2)));
                double area =  3.14 * Math.pow(radius, 2); 
                    
                System.out.println("ALTURA = " + twoHouses.format(height));
                System.out.println("AREA = " + twoHouses.format(area));
                
            }

            
        } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
        }
    }
}