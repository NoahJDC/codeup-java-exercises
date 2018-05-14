package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    private double average;

    public Student(String name){
        this.name = name;
        grades = new ArrayList<>();

    }

    public String getName(){
        return name;
    }
    public void addGrade(int grade){
        grades.add(grade);

    }
    public double getGradeAverage(){
        double sum = 0;
        for(Integer grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
    public void showAllGrades() {
        for(int grade : grades) {
            System.out.print(grade + "\t");
        }
    }

    public String toString() {
        return name + " earned an average grade of " + getGradeAverage() + ".";
    }

    public static void main(String[] args) {
        Student student = new Student("John");
        student.addGrade(91);
        student.addGrade(93);
        student.addGrade(60);
        System.out.println(student);
    }
}
