import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);

        //LOOP BASICS


        for (int i = 5; i <= 15; i++) {
            System.out.println(i);
        }


        //continually passing 0s after 65536
        for (int x = 2; x <= 100; x *= x) {
            System.out.println(x);
        }

        //Print (String.valueOf(i)) at the end so if/elseif run first
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(String.valueOf(i));
            }
        }

        System.out.println("what number would you like to go up to?");
        String integerString = sc.next();
        int integer = Integer.parseInt(integerString);
        System.out.println("Here is your table!");
        System.out.println("number | Squared | Cubed");
        System.out.println("------ | ------- | -----");
        for(int i = 1; i<=50; i++){
            int cubed = i * i * i;
            if(i <= integer)
            System.out.println(i + "      " + "| " + i*i  + "       " + "| " + cubed);
        }

        System.out.println("Input number between 0 - 100");
        String gradeString = sc.next();
        int grade = Integer.parseInt(gradeString);
            if (grade > 88){
                System.out.println("A");
            } else if(grade <= 87 && grade >= 80){
                System.out.println("B");
            } else if(grade <=79 && grade >= 67){
                System.out.println("C");
            } else if(grade <=66 && grade >= 60){
                System.out.println("D");
            } else if(grade <=59 && grade >= 0){
                System.out.println("F");
            }






    }
}

