package shapes;

public class Square extends Quadrilateral{
    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;

    }

    public Square(int side) {
        super(side,side);
    }

}

