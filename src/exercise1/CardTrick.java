package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2021
 * @author Scott Tyler jan 2021
 */
import java.util.Scanner;
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
           
            Card card = new Card();
            
            card.setValue((int)(Math.random() * 13)+1);
            
            card.setSuit(Card.SUITS[(int)(Math.random() * 3)]);
            
           // System.out.println("Suit: " + card.getSuit()+ "\nValue: " + card.getValue());
            
            hand[i] = card;
            //card.setValue(insert call to random number generator here)
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        System.out.println("Guess the card number value");
        
        Scanner in = new Scanner(System.in);
        
        int guessValue = in.nextInt();
        
        System.out.println("Guess the card suit(Hearts,Diamonds,Clubs,Spades)");
        
        Scanner in2 = new Scanner(System.in);
        
        String guessSuit = in2.nextLine();
        
        for(int j=6; j>0; j--){
        
            if(guessValue == hand[j].getValue()&& guessSuit.equalsIgnoreCase(hand[j].getSuit())){
            
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
