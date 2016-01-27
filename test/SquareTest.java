import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {

    @Test
    public void shouldCalculateAreaOneForGivenSideValueOne() {
        Square square = new Square(1);
        assertEquals(1, square.calculateArea());
    }
}
