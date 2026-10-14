import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseNumberTest {

    @Test
    public void testReverseNumber() {
        assertEquals(4321, ReverseNumber.reverse(1234));
    }

    @Test
    public void testReverseNumberWithZero() {
        assertEquals(21, ReverseNumber.reverse(1200));
    }
}
