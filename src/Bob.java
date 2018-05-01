import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.print("Tell bob something: ");
        String remarks = input.next();
        if(remarks.endsWith("!")){
            System.out.println("Whoa, chill out!");
        } else if(remarks.endsWith("?")){
            System.out.println("Sure.");
        } else if(remarks.trim().equals("")){
            System.out.println("Fine. Be that way!");
        } else{
            System.out.println("Whatever");
        }
    }
}
