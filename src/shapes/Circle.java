package shapes;

public class Circle {
    private Double radius;

    public Circle(double r){
        radius = r;
        numberOfCircles++;
    }
    public double getArea(){
        double area = Math.PI * (radius * radius);
        return area;

    }
    public double getCircumference(){
        double circumference = Math.PI * (2*radius);
        return circumference;

    }

    private static int numberOfCircles = 0;

    public static int getNumberOfCircles(){
        return numberOfCircles;
    }
}
