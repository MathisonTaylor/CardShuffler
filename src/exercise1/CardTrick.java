package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks
 * the user to pick a card. It then searches the array of cards for the match to
 * the user's card. To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2021
 * @author Danylo Andriushchenko 26/01/2021
 */
import java.util.Scanner;
import java.util.Random;

public class CardTrick {

    public static void main(String[] args) {

        Random randomizer = new Random();

        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(randomizer.nextInt(12) + 1);
            card.setSuit(Card.SUITS[randomizer.nextInt(4)]);
            hand[i] = card;
        }

        Scanner input = new Scanner(System.in);
        boolean guessed = false;
        
        while (!guessed) {
            System.out.println("Please, enter the card value: ");

            int value = input.nextInt();

            System.out.println("Now enter the suit of the card:");

            input = new Scanner(System.in);
            String suit = input.next();

            Card userCard = new Card();
            userCard.setSuit(suit);
            userCard.setValue(value);

            for (Card card : hand) {
                if (userCard.getValue() == userCard.getValue() && userCard.getSuit().toLowerCase().equals(card.getSuit().toLowerCase())) {
                    printInfo();
                    guessed = true;
                }
            }
            if (!guessed){
                System.out.println("Please, try again");
            }
        }

    }

    /**
     * A simple method to print out personal information. Follow the
     * instructions to replace this information with your own.
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
