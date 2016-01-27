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


}
