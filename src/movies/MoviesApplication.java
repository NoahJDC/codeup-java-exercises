package movies;
import util.Input;
public class MoviesApplication {
    public static Movie[] movies = MoviesArray.findAll();
    public static Input input = new Input();
    public static void showMenu(){
        do{
            System.out.println("What would you like to do?");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view all movies in the animated catagory");
            System.out.println("3 - view all movies in the drama catagory");
            System.out.println("4 - view all movies in the horror catagory");
            System.out.println("5 - view all moies in the scifi catagory");
            int choice = getChoice();
            handleChoice(choice);
        }while(true);
    }
    public static int getChoice(){
        return input.getInt();
    }

    public static void handleChoice(int choice){
        if(choice==0){
            System.out.println("Thank you. Come again");
            System.exit(0);
        } else if(choice==1){
            showMovies();
        } else if(choice==2){
            showMovies("animated");
        }else if(choice==3){
            showMovies("drama");
        }else if(choice==4){
            showMovies("horror");
        }else if(choice==5){
            showMovies("scifi");
        } else {
            System.out.println("Your choice is not valid");
        }
    }

    public static void showMovies(){
        for(Movie movie : movies){
            System.out.println(movie.getName() + ", Catagory: " + movie.getCatagory());
        }
    }

    public static void showMovies(String catagory){
        for(Movie movie : movies) {
            if(movie.getCatagory().equals(catagory)){
                System.out.println(movie.getName() + ", Catagory: " + movie.getCatagory());
            }
        }
    }

    public static void main(String[] args) {
        showMenu();
    }
}
