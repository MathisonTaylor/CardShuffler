package excercise1;
import java.util.*;
import exercise1.Card;


/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks
 * the user to pick a card. It then searches the array of cards for the match to
 * the user's card. To be used as starting code in Exercise
 *
 * 
 * @author Mathison Taylor Jan 2021
 */
public class CardTricks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        String[] hand = new String[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue((int) ((Math.random()*13)+1));
            String value = String.valueOf(card.getValue());
            card.setSuit(Card.SUITS[rand.nextInt(4)]);   
            hand[i] = value+" "+card.getSuit();
            System.out.println(hand[i]);
        }
        
        System.out.println("Guess a card that was dealt: ");
        String answer = in.nextLine();
        List<String> handList = Arrays.asList(hand);
        boolean result = handList.contains(answer);
        if(result)
            printInfo();
        else
            System.out.println("That card was not in your hand!");
        
    }

    private static void printInfo() {

        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        System.out.println("My name is Mathison");
        System.out.println();

        System.out.println("My career ambitions: are to create new and efficeint+"
                + " products that solve issues.");
        System.out.println("-- Have a semester with no violations of academic integrity!");
        System.out.println();

        System.out.println("My hobbies:");
        System.out.println("-- Rock climbing");
        System.out.println("-- Ultimate frisbee");
        System.out.println("-- Su Doku");
        System.out.println("-- Dancing");
        System.out.println();

        System.out.println("Music I like:");
        System.out.println("-- Anything with a good beat");
        System.out.println("-- Relaxing and soulful");
        System.out.println("-- Pretty much anything but country!");
    }

}

