package cardgames;

public class Card {
    private String suit;
    private String value;
    private int points;

    public String getValue() {
        return value;
    }

    public int getPoints() {
        return points;
    }

    public String getSuit(){
        return suit;
    }

    public Card(String suit, String value, int points){
        this.suit = suit;
        this.value = value;
        this.points = points;
    }




}
