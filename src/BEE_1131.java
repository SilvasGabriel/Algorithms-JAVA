import java.util.Scanner;

/*
 *  Grenais
 * 
 *  The Gaucho Football Federation hired you to write a program to make statistics on the results of several GRENAIS. 
 *  Write a program to read the number of goals scored by Inter and Grêmio in a GRENAL. 
 *  Right after writing the message "New grenal (1-yes 2-no)" and requesting a response. 
 *  If the answer is 1, the algorithm must be run again requesting the number of goals scored by the teams in a new match, otherwise it must be terminated by printing:
 * 
 *   - How many GREAIS were part of the statistics.
 *   - The number of Inter victories.
 *   - The number of Grêmio victories.
 *   - The number of Draws.
 *   - A message indicating which team won the most GRENAIS (or "There was no winner", if it ends in a tie).
 * 
 *   
 *   Entry
 *   The input file contains 2 integer values, corresponding to the goals scored by Inter and Grêmio respectively. 
 *   Then there will be an integer (1 or 2), corresponding to the program repetition.
 * 
 *   Exit
 *   After each reading of the goals, the message "New grenal (1-yes 2-no)" must be printed.
 *   When the algorithm is terminated, the statistics must be shown as described above. Note: the word "Gremio" must be printed without an accent, as shown in the example below.
 * 
 *   Input Example        Output Example
 *        3 2           New grenal(1-yes 2-no)
 *        1             New grenal(1-yes 2-no)
 *        2 3           New grenal(1-yes 2-no)
 *        1             3 grenais
 *        3 1           Inter:2
 *        2             Gremio:1
 *                      Draws:0
 *                      Inter won more
 * 
 */

public class BEE_1131 {

    public static void main(String[] args) {

        try(Scanner read = new Scanner(System.in)){
       
            int interWin = 0;
            int gremioWin = 0;
            int draw = 0;
            int grenais = 0;

            while (true) {

              int golInter = read.nextInt();
              int golGremio = read.nextInt();
              
              System.out.println("Novo grenal (1-sim 2-nao)");
              int novoGrenal = read.nextInt();
                
              if(golInter > golGremio){
                interWin++;
              }else if (golInter == golGremio) {
                draw++;
              }else{
                gremioWin++;
              }

              if(novoGrenal == 1){
                 grenais++;
                 continue;
              }else if(novoGrenal == 2){
                break;
              }
            
            }

            System.out.println(grenais + " grenais"); 
            System.out.println("Inter:" + interWin);
            System.out.println("Gremio:" + gremioWin);
            System.out.println("Empates:"+ draw);
            if(interWin > gremioWin){
               System.out.println("Inter venceu mais");
            }else if (interWin == gremioWin) {
               System.err.println("Nao houve vencedor");
            }else{
               System.out.println("Gremio venceu mais");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }

}