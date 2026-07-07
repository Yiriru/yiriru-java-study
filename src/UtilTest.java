import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UtilTest {
    @Test
    public void testPrintln() throws Exception {
        String output = TestOutput.captureOutput(() -> Util.println("Utility message"));

        assertEquals("Utility message" + System.lineSeparator(), output);
    }
}
