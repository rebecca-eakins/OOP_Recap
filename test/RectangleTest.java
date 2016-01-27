import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Test(expected = RectangleException.class)
    // Need to ensure valid rectangles, NOT constantly validate with separate
    // method --> illegal state.
    public void shouldHaveLength() throws RectangleException {
        Rectangle rectangle = new Rectangle(0, 3);
        rectangle.checkAttributes();
    }

    @Test(expected = RectangleException.class)
    public void shouldHaveWidth() throws RectangleException {
        Rectangle rectangle = new Rectangle(3, 0);
        rectangle.checkAttributes();
    }

    @Test
    public void shouldNotCalculateAreaWhen() {

    }

    @Test
    public void shouldCalculateAreaWhenLengthIsValid() throws Exception {
        Rectangle rectangle = new Rectangle(6,4);
        assertEquals(24,rectangle.calculateArea());
    }
}
