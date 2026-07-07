import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TireTest {
    @Test
    public void testNewTireHasPositionAndStartsStopped() {
        Tire testTire = new Tire(TirePosition.FRONT_LEFT);

        assertEquals(TirePosition.FRONT_LEFT, testTire.position);
        assertFalse(testTire.isRolling);
    }

    @Test
    public void testRollChangesTireToRolling() throws Exception {
        Tire testTire = new Tire(TirePosition.FRONT_LEFT);

        TestOutput.captureOutput(() -> testTire.roll());

        assertTrue(testTire.isRolling);
    }

    @Test
    public void testStopChangesTireToStopped() throws Exception {
        Tire testTire = new Tire(TirePosition.FRONT_LEFT);
        testTire.isRolling = true;

        TestOutput.captureOutput(() -> testTire.stop());

        assertFalse(testTire.isRolling);
    }
}
