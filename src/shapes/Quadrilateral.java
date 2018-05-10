package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected int width;
    protected int length;
    public abstract void  setLength(int length);
    public abstract void setWidth(int width);

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }


    public Quadrilateral(int length, int width){
        this.length = length;
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
