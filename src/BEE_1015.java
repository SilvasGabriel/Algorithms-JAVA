import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * DISTANCE BETWEEN TWO POINTS
 * 
 * Read the four values ​​corresponding to the x and y axes of any two points in the plane, p1(x1,y1) and p2(x2,y2)
 * and calculate the distance between them, showing 4 decimal places, according to the formula:
 * 
 * Distance = √(x2-x1)^2 + (y2-y1)^2
 * 
 * INPUT
 * The input file contains two lines of data. 
 * The first line contains two floating values: x1 y1 
 * and the second line contains two floating point values ​​x2 y2.
 *
 */


public class BEE_1015 {

    public static void main(String[] args) {

        try (Scanner read = new Scanner(System.in)) {
            DecimalFormat four_houses = new DecimalFormat("0.0000");
            double eixox1 = read.nextDouble();
            double eixoy1 = read.nextDouble();
            double eixox2 = read.nextDouble();
            double eixoy2 = read.nextDouble();

            double distance = Math.sqrt(Math.pow((eixox2-eixox1), 2) + Math.pow((eixoy2-eixoy1), 2));
            
            System.out.println(four_houses.format(distance));
        }

    }

    
}