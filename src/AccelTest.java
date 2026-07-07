import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AccelTest {
    @Test
    public void testPressIncreasesCarSpeedAndRollsAllTires() throws Exception {
        Car car = new Car();
        Accel accel = new Accel(car);

        TestOutput.captureOutput(() -> accel.press());

        assertEquals(10, car.speed);
        assertTrue(car.frontLeftTire.isRolling);
        assertTrue(car.frontRightTire.isRolling);
        assertTrue(car.backLeftTire.isRolling);
        assertTrue(car.backRightTire.isRolling);
    }

    @Test
    public void testPressRepeatedlyIncreasesSpeedByTen() throws Exception {
        Car car = new Car();
        Accel accel = new Accel(car);

        TestOutput.captureOutput(() -> {
            accel.press();
            accel.press();
        });

        assertEquals(20, car.speed);
    }
}
