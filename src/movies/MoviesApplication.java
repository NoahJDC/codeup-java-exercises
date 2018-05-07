package movies;
import util.Input;
public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        MoviesArray moviesArray = new MoviesArray();
        Movie[] list = moviesArray.findAll();

        System.out.println("What would you like to do?");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view all movies in the animated catagory");
        System.out.println("3 - view all movies in the drama catagory");
        System.out.println("4 - view all movies in the horror catagory");
        System.out.println("5 - view all moies in the scifi catagory");

        System.out.println("Enter your choice: ");
        String catagory = input.getString();
        if(input = )
    }
}
