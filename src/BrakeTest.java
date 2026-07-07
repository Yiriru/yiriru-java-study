import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BrakeTest {
    @Test
    public void testPressDecreasesCarSpeedByTen() throws Exception {
        Car car = new Car();
        Accel accel = new Accel(car);
        Brake brake = new Brake(car);
        car.startEngine();
        TestOutput.captureOutput(() -> {
            accel.press();
            accel.press();
        });

        TestOutput.captureOutput(() -> brake.press());

        assertEquals(10, car.speed);
        assertTrue(car.frontLeftTire.isRolling);
        assertTrue(car.frontRightTire.isRolling);
        assertTrue(car.backLeftTire.isRolling);
        assertTrue(car.backRightTire.isRolling);
    }

    @Test
    public void testPressStopsCarWhenSpeedBecomesZero() throws Exception {
        Car car = new Car();
        Accel accel = new Accel(car);
        Brake brake = new Brake(car);
        car.startEngine();
        TestOutput.captureOutput(() -> accel.press());

        TestOutput.captureOutput(() -> brake.press());

        assertEquals(0, car.speed);
        assertFalse(car.frontLeftTire.isRolling);
        assertFalse(car.frontRightTire.isRolling);
        assertFalse(car.backLeftTire.isRolling);
        assertFalse(car.backRightTire.isRolling);
    }

    @Test
    public void testPressWhileStoppedDoesNotMakeSpeedNegative() throws Exception {
        Car car = new Car();
        Brake brake = new Brake(car);

        TestOutput.captureOutput(() -> brake.press());

        assertEquals(0, car.speed);
        assertFalse(car.frontLeftTire.isRolling);
        assertFalse(car.frontRightTire.isRolling);
        assertFalse(car.backLeftTire.isRolling);
        assertFalse(car.backRightTire.isRolling);
    }
}
