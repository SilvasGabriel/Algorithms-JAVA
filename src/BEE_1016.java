import java.util.Scanner;

/*
 * DISTANCE
 * 
 * Two cars (X and Y) leave in the same direction. 
 * Car X leaves with a constant speed of 60 km/h and car Y leaves with a constant speed of 90 km/h.
 * In one hour (60 minutes) car Y can move 30 kilometers away from car X, that is, it can move one kilometer away every 2 minutes.
 * Read the distance (in km) and calculate how long it takes (in minutes) for car Y to travel that distance from the other car.
 * 
 * INPUT
 * 
 * The input file contains an integer number.
 * 
 */

public class BEE_1016 {

    public static void main(String[] args) {
        
        try (Scanner read = new Scanner(System.in)) {
            int carroX = 60;
            int carroY = 90;
            int velocidade_total = carroY - carroX;
            /*
             *      
             *      T = Distance x time in (minutes,hours,seconds,etc)
             *          ----------------------------------------------
             *                     Speed between the cars
             * 
             */
            int distancia = read.nextInt();
            int tempo = (distancia * 60)/velocidade_total;

            System.err.println(tempo+" minutos");
        }


    }
    
}