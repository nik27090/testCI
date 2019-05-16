import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class MainTest {
    @Test
    public void shouldBigger(){
        assertTrue(Main.isBigger(10,5));
    }
    @Test
    public void shouldNotBigger(){
        assertFalse(Main.isBigger(5,10));
    }
}
