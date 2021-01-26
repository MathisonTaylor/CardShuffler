package exercise1;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author AASFLC
 * @author Andraws Putros Jan 2021
 */
public class CardTrick
{

    public static void main(String[] args)
    {
        
        Card[] hand = new Card[7];
        Random rand = new Random();
         int low = 1;
         int high = 14;

        for (int i = 0; i < hand.length; i++)
        {
            int value = rand.nextInt(high-low) + low;
            int suit = rand.nextInt(4);
            Card card = new Card();
           
            card.setValue(value);
            card.setSuit(Card.SUITS[suit]);
            
            hand[i]=card;
            //System.out.println(hand[i].getValue() + hand[i].getSuit());
        }

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        
        System.out.println("Enter your card value (1-13):");
        int cardValue = scanner.nextInt();  // Read user input
        System.out.println("Card value is: " + cardValue);  // Output user input
        
        String empty = scanner.nextLine(); //Empty scanner to read next line
        
        System.out.println("Enter your card suit (Clubs, Spades, Diamonds, Hearts):");
        String cardSuit = scanner.nextLine();  // Read user input
        System.out.println("Card suit is: " + cardSuit);  // Output user input
        
        for (int i = 0; i < hand.length; i++)
        {
            if(cardValue == hand[i].getValue() && cardSuit.equals(hand[i].getSuit()))
            {
                printInfo();
            }
        }
        
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here.
        // If the guess is successful, invoke the printInfo() method below
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     */
    private static void printInfo() //I'm done!
    {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Andraws, but you can call me Andraws. Sorry, no nicknames :(");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Own my own restaurant");
        System.out.println("-- Work towards my dreams and goals");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Boardgames and videogames");
        System.out.println("-- Driving my car");
        System.out.println("-- Cooking");
        System.out.println("-- Designing and coding");
        System.out.println();
        
        System.out.println("Music I like:");
        System.out.println("-- Rap");
        System.out.println("-- Rock/Punk");
        System.out.println("-- I used to listen to a lot of new school metal");    
    }

}
