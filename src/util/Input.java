package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
    public Input(){
         this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Type something down");
        return scanner.next();
    }
    public boolean yesNo(){
        System.out.println("Would you like to continue?");
        String option = scanner.next();
        if(option.equalsIgnoreCase("yes") || option.equalsIgnoreCase("y")){
            return true;
        }
        return false;
    }
    public int getInt(int min, int max){
        System.out.println("Enter a number between " + min + "and " + max);
        String responseString = scanner.next();
        int response = Integer.parseInt(responseString);
        if(response<min || response>max){
            System.out.println("Invalid Number");
            return getInt(min, max);
        }
        return response;
    }
    public int getInt(){
        System.out.println("type a number");
        return scanner.nextInt();
    }
    public double getDouble(double min, double max){
        System.out.println("Enter a number between " + min + "and " + max);
        String responseString = scanner.next();
        double response = Double.parseDouble(responseString);
        if(response<min || response>max){
            return getDouble(min, max);
        }
        return response;
    }
    public double getDouble(){
        System.out.println("make a decimal number");
        return scanner.nextDouble();
    }

}
