
// Importing JUnit 5 packages
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// Class containing the methods to be tested
public class NumberUtils {

    // Method for checking if a number is even or odd
    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Method for checking if a number is in the interval (25, 100)
    public boolean numberInInterval(int n) {
        return n > 25 && n < 100;
    }

    // Nested class for JUnit tests
    public static class NumberUtilsTest {

        NumberUtils utils = new NumberUtils();

        @Test
        public void testEvenOddNumber() {
            assertTrue(utils.evenOddNumber(2));
            assertFalse(utils.evenOddNumber(3));
            assertTrue(utils.evenOddNumber(0));
            assertFalse(utils.evenOddNumber(-1));
            assertTrue(utils.evenOddNumber(-2));
        }

        @Test
        public void testNumberInInterval() {
            assertFalse(utils.numberInInterval(24));
            assertFalse(utils.numberInInterval(25));
            assertTrue(utils.numberInInterval(26));
            assertTrue(utils.numberInInterval(99));
            assertFalse(utils.numberInInterval(100));
            assertFalse(utils.numberInInterval(101));
        }
    }
}
