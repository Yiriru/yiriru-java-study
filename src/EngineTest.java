import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EngineTest {
    @Test
    public void testNewEngineStartsOff() {
        Engine engine = new Engine();

        assertFalse(engine.isRunning);
    }

    @Test
    public void testStartTurnsEngineOn() {
        Engine engine = new Engine();

        engine.start();

        assertTrue(engine.isRunning);
    }

    @Test
    public void testStopTurnsEngineOff() {
        Engine engine = new Engine();
        engine.start();

        engine.stop();

        assertFalse(engine.isRunning);
    }
}
