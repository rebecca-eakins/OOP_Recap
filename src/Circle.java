public class Circle {

    private final int radius;

    public Circle(int radius) throws CircleException {
        this.radius = radius;
        if(radius<0)
            throw new CircleException("radius should be greater than 0");

    }

    public double calculateArea() {
        return (Math.PI * radius * radius);
    }
}
