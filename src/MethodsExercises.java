import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(2, 4));
        System.out.println(subtraction(5, 6));
        System.out.println(multiplication(10, 0));
        System.out.println(division(10, 9));
        System.out.println(modulus(4, 15));
        do {
            int response = getInteger(1, 10);
            if (proceed("Would you like to display the factorial of the number? ")) {
                System.out.println("Factorial of " + response + " is " + factorial(response));
            }
        } while (proceed("Would you like another factorial?"));
        int sides = sidesOfDice();
        do {
            wantToRoll();
            int roll = dice(sides);
            int roll2 = dice(sides);
            System.out.println("Your first roll is : " + roll + " and second roll is: "+ roll2);
        } while(proceed("Want another roll?"));

        System.out.println(guess(30));
    }

    public static int addition(int number, int add){
        return number + add;
    }
    public static int subtraction(int number, int reduce){
        return number - reduce;
    }
    public static int multiplication(int number, int times){
        if (times == 0){
            return 0;
        } if (times == 1){
            return number;
        }
        return number + multiplication(number, times-1);

    }
    public static double division(int number, int divide){
        return number / divide;
    }
    public static int modulus(int number, int remainder){
        return number % remainder;
    }

    public static int getInteger(int min, int max){
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter a number between min and max: ");
        String responseString = input.next();
        int response = Integer.parseInt(responseString);
        if(response<min || response>max){
            System.out.println("Invalid Number.");
            return getInteger(min, max);
            }
            return response;

    }
    public static boolean proceed(String message){
        Scanner input;
        input = new Scanner(System.in);
        System.out.println(message);
        String option = input.next();
        if(option.equalsIgnoreCase("y") || option.equalsIgnoreCase("yes")){
            return true;
        }
        return false;
    }
    public static int factorial(int response){
        int fact = 1;
        for (int i = 1; i<=response; i++){
            fact *= i;
        }
        return fact;
    }
    public static int sidesOfDice(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many sides in the dice?");
        return input.nextInt();
    }

    public static int dice(int sides){
        return (int) (Math.random() * sides) +1;
    }

    public static void wantToRoll(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any key to roll");
        input.nextLine();
    }

    public static int guess(int luckyNumber){
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100");
        String numberString = input.next();
        int number = Integer.parseInt(numberString);
        if (number<1 || number>100){
            System.out.println("Number not between 1 and 100");
            return guess(luckyNumber);
        }if(number == luckyNumber){
            System.out.println("Good Guess!");
        } if(number>luckyNumber){
            System.out.println("LOWER");
        } if(number<luckyNumber){
            System.out.println("HIGHER");
        }
        return guess(luckyNumber);
    }
}
