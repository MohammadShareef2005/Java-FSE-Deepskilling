
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCalculator {

    @Test
    public void testAdd() {
        Calculator c = new Calculator();
        assertEquals(5, c.add(2, 3));
    }
}
