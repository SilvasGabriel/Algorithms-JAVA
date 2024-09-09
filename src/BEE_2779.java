import java.util.ArrayList;
import java.util.Scanner;
/**
 * Album of the Cup
 * 
 * In Soccer World Cup year, the official album of cards is always a great success among children and also among adults. For those who do not know, the album contains spaces numbered from 1 to N to paste the cards; each sticker, also numbered from 1 to N, is a small photo of a player from one of the selections that will play the World Cup. 
 * The goal is to paste all the cards in the respective spaces in the album, in order to complete the album (that is, leave no space without the corresponding sticker).
 * The cards are sold in sealed envelopes, so the buyer does not know which cards he is buying, and it may happen that he has bought a card he has already pasted on the album.
 * To help users, the company that sells the album and stickers wants to create an application that allows them to easily manage the missing pieces to complete the album and is asking for their help.
 * Given the total number of spaces and stickers in the album, and a list of already purchased cards (which may contain repeated cards), your task is to determine how many cards are missing to complete the album.
 * 
 * Input
 * 
 * The first line contains an integer (1 ≤ N ≤ 100), on total stickers and spaces in the album. The second line contains an integer M (1 ≤ M ≤ 300) from the number of stickers already purchased. Each of the Múrias closed the entire X (1 ≤ X ≤ N), indicating a card already bought.
 * 
 * Output
 * 
 * Your program should produce a single line containing an integer representing the number of missing cards to complete the album.
 * 
 * Input Samples	        Output Samples
 *      10                      7
 *      3
 *      5
 *      8
 *      3
 * 
 *      5                       3
 *      6    
 *      3 
 *      3
 *      2
 *      3
 *      3
 *      3
 * 
 *      3                       0
 *      4
 *      2 
 *      1
 *      3
 *      3
 * 
 */
public class BEE_2779 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            
            ArrayList<Integer> stickers = new ArrayList<Integer>();
            
                //number of slots in the album
                int slotsInAlbum = read.nextInt();
                //number of sticks that i have
                int numberOfSticksIhave = read.nextInt();

                //loop for number of packs that i have
                for (int i = 0; i < numberOfSticksIhave; i++) {
                    //new variable to retain the sticcker
                    int  sticker = read.nextInt();
  
                    //if i dont have the sticker add on one list
                    if(!(stickers.contains(sticker))){

                        stickers.add(sticker);

                    }
           
                }

                //to find how many is missing just subtract the slots minus the sise of the list
                int missingStickers = slotsInAlbum - stickers.size();

                System.out.println("\n");

                System.out.println(missingStickers);
            


        } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
        }
    }
}