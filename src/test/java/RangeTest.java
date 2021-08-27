import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RangeTest {
    @Test
    public void isStartWithInclusiveWithKampooShouldBeTrue () {
        Range range = new Range("[1,5]");
        boolean actualResult = range.isStartWithInclusive();
        assertTrue(actualResult);
    }

    @Test
    public void isStartWithInclusiveWithKampooShouldBeFalse () {
        Range range = new Range("(1,5]");
        boolean actualResult = range.isStartWithInclusive();
        assertTrue(actualResult);
    }
}
