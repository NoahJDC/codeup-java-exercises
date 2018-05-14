package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
    public Input(){
         this.scanner = new Scanner(System.in);
    }

    public String getString(){
        return scanner.nextLine();
    }
    public boolean yesNo(){
        String answer = scanner.next();
        return "y".equalsIgnoreCase(answer) || "yes".equalsIgnoreCase(answer);
    }
    public int getInt(int min, int max){
        String responseString = scanner.next();
        int response = Integer.parseInt(responseString);
        if(response<min || response>max){
            System.out.println("Invalid Number");
            return getInt(min, max);
        }
        return response;
    }
    public int getInt(){
        return scanner.nextInt();
    }
    public double getDouble(double min, double max){
        String responseString = scanner.next();
        double response = Double.parseDouble(responseString);
        if(response<min || response>max){
            return getDouble(min, max);
        }
        return response;
    }
    public double getDouble(){
        return scanner.nextDouble();
    }

}
