public class ControlFlowExercises {
    public static void main(String[] args) {
        //LOOP BASICS

        int i = 5;
        while (i <= 15) {
            System.out.println("i is " + i);
            i++;
        }

        //continually passing 0s after 65536
        int x = 2;
        do {
            System.out.println(x);
            x *= x;
        } while (x <= 65536);
    }
}