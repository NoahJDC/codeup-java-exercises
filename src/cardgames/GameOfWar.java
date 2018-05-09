package cardgames;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GameOfWar {
    public static Card[] cards = CardsArray.findAll();
    public static int n = cards.length;

    public static void getAllCards(){
        for(Card card : cards){
            System.out.println(card.getValue() + " of " + card.getSuit());
        }
    }

    public static void splitDeck(){
        Card[] a = Arrays.copyOfRange(cards,0, (n+1)/2);
        Card[] b = Arrays.copyOfRange(cards, (n + 1)/ 2, n);
    }

    public static void main(String[] args) {
        List<Card> list = Arrays.asList(cards);
        Collections.shuffle(list);
        System.out.println("String Array: ");
        getAllCards();
        splitDeck();


    }
}
