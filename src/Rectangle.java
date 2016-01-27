
public class Rectangle {
    private final int length;
    private final int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calculateArea() {
        return length * width;
    }

    public void checkAttributes() throws RectangleException {
        if(length==0)
            throw new RectangleException("Length must be greater than zero.");
        if(width == 0)
            throw new RectangleException("Width must be greater than zero.");
    }
}
