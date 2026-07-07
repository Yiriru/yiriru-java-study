import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class CarTest {
    @Test
    public void testNewCarStartsStopped() {
        Car car = new Car();

        assertEquals(0, car.speed);
        assertFalse(car.frontLeftTire.isRolling);
        assertFalse(car.frontRightTire.isRolling);
        assertFalse(car.backLeftTire.isRolling);
        assertFalse(car.backRightTire.isRolling);
    }

    @Test
    public void testNewCarHasFourTiresInKnownPositions() {
        Car car = new Car();

        assertEquals(TirePosition.FRONT_LEFT, car.frontLeftTire.position);
        assertEquals(TirePosition.FRONT_RIGHT, car.frontRightTire.position);
        assertEquals(TirePosition.BACK_LEFT, car.backLeftTire.position);
        assertEquals(TirePosition.BACK_RIGHT, car.backRightTire.position);
    }
}
