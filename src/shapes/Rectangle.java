package shapes;

public class Rectangle {
    protected static double length;
    protected static double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public static int getArea(){
        double area = Math.PI * (length * width);
    }
    public static int getPerimeter(){
        double perimeter = Math.PI * (2*length + 2*width);
    }
}
