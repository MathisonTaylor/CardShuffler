package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks 
 * the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2021
 * @author Ji Li
 */
import java.util.Arrays;
import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        
        //create a scanner object for prompt the user
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();            
            
            //generate a random integer from 1 to 13
            //card.setValue(insert call to random number generator here)
            int randomNumber1To13 = (int)(Math.random() * 13 + 1);
            card.setValue(randomNumber1To13);
            
            //generate a random integer from 0 to 3
            //card.setSuit(Card.SUITS[insert call to random number 
            //between 0-3 here])
            int randomNumber0To3 = (int)(Math.random() * 4);
            card.setSuit(Card.SUITS[randomNumber0To3]);
            
            //assign card to hand array element
            hand[i] = card;
        }
        
        //print out the hand, for testing only
        //TODO: comment out or delete next statement when merge into master.
        System.out.println(Arrays.toString(hand));

        // insert code to ask the user for Card value and suit, 
        //create their card
        System.out.print("Please enter Card Value(1 - 13): ");
        int userValue = input.nextInt();
        
        System.out.print("Please enter suit(Diamond, clubs, spades, hearts): ");
        String userSuit = input.next();

        //create a user Card object, and set all the data.
        Card userCard = new Card();
        
        userCard.setSuit(userSuit);
        userCard.setValue(userValue);
        
        // and search the hand here.
        for (Card hand1 : hand) {
            if (userCard.getSuit().equalsIgnoreCase(hand1.getSuit()) 
                    && userCard.getValue() == hand1.getValue()) {
                
                // If the guess is right, invoke the printInfo() method below
                printInfo();
            }
        }
        System.out.println("Thank you for playing, Try again next time.");
        
        
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Start writing articles/posts on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Playing with technology");
        System.out.println("-- Riding my motorcycle");
        System.out.println("-- Cooking");
        System.out.println("-- Listening to music");
        System.out.println();
        
        System.out.println("Music I like:");
        System.out.println("-- Pink Floyd / David Gilmore");
        System.out.println("-- Green Day");
        System.out.println("-- Many other styles and genres as well...");    
    }

}
