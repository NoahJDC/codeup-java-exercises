public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.print("Hello, World!");
        System.out.println();
        int myFavoriteNumber = 2;
        System.out.println(myFavoriteNumber);

        String  myString = "I am sleepy today.";
        System.out.println(myString);
        // ** DECLARING
        // int myFavoriteNumber;
        // ** INITIALIZING
        //myFavoriteNumber = 3;

        // does not convert string to char
//        char someString = myString;
//        System.out.println(someString);

        // shows that double cannot be converted to string
//        myString = 3.14159;


        //myNumber was not initialized. Must be initialized ( given a value for the first time)
        //shows incompatible types when doing a long with a double
        //associating myNumber to '123L' when doing long printed out '123L'
        //removing L also spits out '123'
//        long myNumber = 3.14;
//        double floatNumber = myNumber;
//        System.out.println(floatNumber);


        //shows that it requires doubles, not float when it comes to values that were assigned a decimal
        //a way to fix this is to make it float myNumber = (float) 3.14;
//        float myNumber = 3.14;
//        System.out.println(myNumber);


        //shows that there was an increment, but positioned was off
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

        //shows an increment happened to x just before the second sout
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//
//        int x = 4;
//        x += 5;
//
//        int x = 3;
//        int y = 4;
//        y *= x;
//
//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;
    }

}
