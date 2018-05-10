package cardgames;

import java.util.*;

import util.Input;

public class GameOfWar {
    public static Card[] cards = CardsArray.findAll();
    public static Input input = new Input();
    public static int n = cards.length;


    public static void gamePrompt(){
            System.out.println("Would you like to play a game of War?" );
            boolean choice = getChoice();
            handleChoice(choice);
            System.out.println("Cards are now shuffled.");
    }

    public static boolean getChoice(){
        return input.yesNo();
    }

    public static void handleChoice(boolean choice){
        if(!choice){
            System.out.println("Later!");
            System.exit(0);
        } else if(choice){
            getAllCards();
        }
    }

    public static void getAllCards(){
        for(Card card : cards){
        }
    }

    private static void shuffleCards(){
        List<Card> list = Arrays.asList(cards);
        Collections.shuffle(list);
    }


    public static void main(String[] args) {
        shuffleCards();
        gamePrompt();

        Card[] a = Arrays.copyOfRange(cards, 0, (n + 1) / 2);
        Card[] b = Arrays.copyOfRange(cards, (n + 1) / 2, n);

        for(Card card: a){
            System.out.println(card.getValue() + " of " + card.getSuit());
            }

        System.out.println();
        for(Card card: b){
            System.out.println(card.getValue() + " of " + card.getSuit());
        }

        System.out.println("Player 1: " + a);
        System.out.println("Player 2: " + b);
        System.out.println("Player " + " wins!");

    }
}
