import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    @Test(expected = CircleException.class)
    public void shouldNotCreateCircleWithRadiusLessThanZero() throws CircleException {
        new Circle(-1);
    }

    @Test
    public void shouldCalculateAreaAsPiWhenRadiusIsOne() throws CircleException {
        Circle circle = new Circle(1);
        assertEquals(Math.PI, circle.calculateArea(),0);
    }

    @Test
    public void shouldCalculatePerimeterAsTwoPIWhenRadiusIsOne() throws CircleException {
        Circle circle = new Circle(1);
        double result = 2* Math.PI;
        assertEquals(result, circle.calculatePerimeter(),0);

    }


}
