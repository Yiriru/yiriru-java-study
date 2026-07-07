import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AccelTest {
    @Test
    public void testPressDoesNotAccelerateWhenEngineIsOff() throws Exception {
        Car car = new Car();
        Accel accel = new Accel(car);

        TestOutput.captureOutput(() -> accel.press());

        assertEquals(0, car.speed);
        assertFalse(car.frontLeftTire.isRolling);
        assertFalse(car.frontRightTire.isRolling);
        assertFalse(car.backLeftTire.isRolling);
        assertFalse(car.backRightTire.isRolling);
    }

    @Test
    public void testPressIncreasesCarSpeedAndRollsAllTiresWhenEngineIsRunning() throws Exception {
        Car car = new Car();
        Accel accel = new Accel(car);
        car.startEngine();

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
        car.startEngine();

        TestOutput.captureOutput(() -> {
            accel.press();
            accel.press();
        });

        assertEquals(20, car.speed);
    }
}
