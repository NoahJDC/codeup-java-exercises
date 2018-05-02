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
    public static int division(int number, int divide){
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
}
