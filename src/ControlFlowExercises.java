public class ControlFlowExercises {
    public static void main(String[] args) {
        //LOOP BASICS


        for (int i = 5; i <= 15; i++) {
            System.out.println(i);
        }


        //continually passing 0s after 65536
        for (int x = 2; x <= 100; x *= x) {
            System.out.println(x);
        }

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

    }
}

