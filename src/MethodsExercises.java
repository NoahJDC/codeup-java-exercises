public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(2, 4));
        System.out.println(subtraction(5, 6));
        System.out.println(multiplication(10, 4));
        System.out.println(division(2, 6));
        System.out.println(modulus(4, 15));
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
}
