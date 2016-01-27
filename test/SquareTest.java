import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {

    @Test(expected = SquareException.class)
    public void shouldRequireSideLengthGreaterThanZero() throws SquareException {
        new Square(0);
    }

    @Test
    public void shouldCalculateAreaOneForGivenSideValueOne() throws SquareException {
        Square square = new Square(1);
        assertEquals(1, square.calculateArea());
    }

    @Test
    public void shouldCalculatePerimeterFourForGivenSideValueOne() throws Exception, SquareException {
        Square square = new Square(1);
        assertEquals(4,square.calculatePerimeter());

    }
}
