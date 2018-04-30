import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        //when entering a string, it will give an Exception in thread "main" message.
        int myNumber;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        myNumber = sc.nextInt();
        System.out.println();

        //When you enter less that 3 words, the system will not provide an out until three words have been made.
        String wordOne;
        String wordTwo;
        String wordThree;
        System.out.print("Please enter three words: ");
        wordOne = sc.next();
        wordTwo = sc.next();
        wordThree = sc.next();
        System.out.println(wordOne);
        System.out.println(wordTwo);
        System.out.println(wordThree);
        System.out.println();


        //when using the .next() method, it only returns the first word
        //nextLine is finishing the code only when using .useDelimeter("\n") on the scanner.
        String sentence;
        System.out.println("Please enter a sentence: ");
        sentence = sc.next();
        System.out.println(sentence);



        //When converting string to int, need to convert to parseInt
        String lengthString = sc.next();
        String widthString = sc.next();
        System.out.println("Please enter the length and width of the class: ");
        int length =Integer.parseInt(lengthString);
        int width =Integer.parseInt(widthString);
        System.out.println("area = " + (length*width));
        System.out.println("perimeter = " + (2*length) + (2*width));




    }
}
