package shapes;

public class Rectangle extends Quadrilateral{

    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getPerimeter() {
        return 2*length + 2*width;
    }

    @Override
    public int getArea() {
        return length * width;
    }

}
