package grades;
import util.Input;
import java.util.HashMap;

public class GradesApplication {
    private static Input input = new Input();
    private static HashMap<String, Student> students;

    public static void main(String[] args) {
        System.out.println("Welcome to the grades application");

        students = getStudents();

        do{
            showStudents(students);

            System.out.println("Enter student name to get grades.");
            String userChoice = input.getString();

            if(students.containsKey(userChoice)) {
                Student student = students.get(userChoice);
                System.out.println(student);
            } else {
                System.out.println(userChoice + " was not found.");

                promptToAddNewStudent();
            }
        } while(input.yesNo("Would you like to get information on another student?"))

    }
}