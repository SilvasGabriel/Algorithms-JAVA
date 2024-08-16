import java.util.Scanner;

/*
 * WEIGHTED AVERAGE
 * 
 * Read 3 values, in this case variables A, B and C, which are a student's three grades.
 * Next, calculate the student's average, knowing that grade A has a weight of 2, grade B has a weight of 3 and grade C has a weight of 5. 
 * Consider that each grade can range from 0 to 10.0, always to one decimal place.
 * 
 * INPUT 
 * 
 * The input file contains 3 double-precision values with one decimal place.
 * 
 */

public class BEE_1006 {

    public static void main(String[] args) {
        
        try (Scanner read = new Scanner(System.in)) {
            double value1 = read.nextDouble();
            double value2 = read.nextDouble();
            double value3 = read.nextDouble();
            double media = ((value1*2)+(value2*3)+(value3*5))/10;

            System.out.println("MEDIA = "+ media);
        }

    }

}