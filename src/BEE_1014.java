import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * EXPENDITURE 
 * Calcule the medium expenditure of a car been provided total distance (in Km)
 * and the total spent of fuel in liters.
 * 
 * INPUT
 * The input contains tro values of:
 * An integer value X respresenting total distance traveled in km.
 * And a real value Y representing total fuel spent, with
 * a three digit after the decimail point. 
 * 
 */

public class BEE_1014 {

    public static void main(String[] args) {
        
        try (Scanner read = new Scanner(System.in)) {
            DecimalFormat tres_casas = new DecimalFormat("0.000");
            int distancia_total = read.nextInt(); 
            double combustivel_gasto = read.nextDouble();
            double consume_medio = (distancia_total / combustivel_gasto) ; 
            System.out.println(tres_casas.format(consume_medio)+" km/l" );
        }
    }
    
}