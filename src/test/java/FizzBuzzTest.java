import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz() {
        assertEquals("1", FizzBuzz.de(1));
        assertEquals("2", FizzBuzz.de(2));
        assertEquals("Fizz", FizzBuzz.de(3));
        assertEquals("Buzz", FizzBuzz.de(5));
        assertEquals("FizzBuzz", FizzBuzz.de(15));
    }
}