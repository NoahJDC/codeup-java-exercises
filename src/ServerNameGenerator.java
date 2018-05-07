import java.util.Random;
public class ServerNameGenerator {
    public static void main(String[] args) {
        String adjectives[] = {"Angry", "Loud", "Clumsy", "Massive", "Friendly", "Bored", "Grumpy", "Kind", "Small", "Large"};
        String nouns[] = {"Man", "Mountain", "Ocean", "Country", "Cat", "House", "Bed", "Clock", "Pen", "Ship"};
        System.out.println("Here is your server name: ");
        String randomAdjective = adjectives[new Random().nextInt(adjectives.length)];
        String randomNoun = nouns[new Random().nextInt(nouns.length)];
        System.out.println(randomAdjective + "-" + randomNoun);
    }
}
