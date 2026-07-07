import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {
    @Test
    public void testIsRolling() {
        Tire testTire = new Tire();
        assertTrue(testTire.isRolling == false);
    }
    @Test
    public void testAccel() {
        Tire frontlefttire = new Tire();
        Tire frontrighttire = new Tire();

        Accel accel = new Accel(frontlefttire, frontrighttire);

        assertTrue(!frontlefttire.isRolling && !frontrighttire.isRolling);

        accel.press();

        assertTrue(frontlefttire.isRolling && frontrighttire.isRolling);
    }
}
