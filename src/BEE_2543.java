import java.util.Scanner;
/**
 * UFPR Gaming
 * 
 *  Like many Computer Science students, you like to play the most popular electronic games nowadays: Liga of Legendas (LOL) and Contra-Strike (CS). Although you also play LOL, what you really like to do is to use all your skills to defeat the terrorist forces in Contra-Strike! You are so good at combating terror that you are often compared with the president of the USA who announced the capture of a famous real-life terrorist.
 *  Since your skills are beyond compare, videos of your matches (your famous gameplays) appears often in UFPR Gaming, a webpage that publishes gameplays from the students of our university.
 *  The page publishes many videos every day. Thus, it may be hard to find and count all your videos published already. However, since you are also a programmer, you decided to write a computer program to help you with this task. Given the list of gameplays published by the page, determine how many of them are videos of you playing Contra-Strike.
 * 
 * Input
 * 
 * The input contains several test cases. The first line of each test case contains two integers N and I (1 ≤ N ≤ 104, 1000 ≤ I ≤ 9999), the number of gameplays published by the page and your university ID, respectively.
 * The next N lines describe the published videos. Each gameplay is described by two integers i and j (1000 ≤ i ≤ 9999, j=0 or 1), where i is the author’s university ID and j=0 if the gameplay is a Contra-Strike one, or j=1 if it is a Liga of Legendas one.
 * The input ends with end-of-file (EOF).
 * 
 * Output
 * 
 * For each test case, print a single line containing a number indicating how many videos of you playing Contra-Strike were published by the page.
 * 
 * Input Sample	        Output Sample
 *      7 5558                2
 *      5693 1
 *      5558 0
 *      6009 1
 *      5558 1
 *      1566 0
 *      5558 0
 *      8757 1
 * 
 */     
public class BEE_2543 {

public static void main(String[] args) {
    try (Scanner read = new Scanner(System.in)) {

        int nberOfGames = read.nextInt();
        int codeST  = read.nextInt();
        
        int countCS = 0;

        for (int i = 0; i < nberOfGames; i++) {
            int code = read.nextInt();
            int typeOfGame = read.nextInt();
            
            if (code == codeST && typeOfGame == 0) {
                countCS++;
            }

        }

        System.out.println(countCS);
        
    } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
    }
  }
}