

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ClockTimeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ClockTimeTest
{
    /**
     * Default constructor for test class ClockTimeTest
     */
    public ClockTimeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testHour()
    {
        ClockTime clockTim1 = new ClockTime(7, 00, 00);
        assertEquals("07:00:00", clockTim1.toString12());
    }

    @Test
    public void testMin()
    {
        ClockTime clockTim1 = new ClockTime(00, 45, 00);
        assertEquals(45, clockTim1.getMinute());
    }

    @Test
    public void testGetSecond()
    {
        ClockTime clockTim1 = new ClockTime(00, 00, 30);
        assertEquals(35, clockTim1.getSecond());
        assertEquals(30, clockTim1.getSecond());
    }
}



