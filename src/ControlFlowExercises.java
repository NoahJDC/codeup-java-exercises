public class ControlFlowExercises {
    public static void main(String[] args) {
        //LOOP BASICS


        for(int i = 0; i<=15; i++){
            System.out.println(i);
        }


        //continually passing 0s after 65536
        for(int x = 2; x<=65536; x*=x){
            System.out.println(x);
        }
    }
}

