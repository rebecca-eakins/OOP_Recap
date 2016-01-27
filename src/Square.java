public class Square {

    private final int side;

    public Square(int side) throws SquareException {
        if(side<=0) {
            throw new SquareException("Side should be greater than 0");
        }
        this.side = side;
    }


    public int calculateArea() {
        return side * side;
    }

    public int calculatePerimeter() {
        return 4 * side;
    }
}
