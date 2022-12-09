import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestPrime {
    @Test
    public void test1() {
        assertEquals(true,IsPrime.testprime(7));
    }
    @Test
    public void test2() {
        assertEquals(true,IsPrime.testprime(8));
    }
}
